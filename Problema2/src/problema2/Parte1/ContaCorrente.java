package problema2.Parte1;
import java.util.ArrayList;

public class ContaCorrente {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private ArrayList<Operacao> operacoes;
    private ArrayList<Servico> servicos;
    
    public ContaCorrente() {
        operacoes = new ArrayList();
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            Operacao operacao = new Operacao(valor, saldo, TipoOperacao.SAIDA, this);
            operacoes.add(operacao);
            this.saldo -= valor;
            /*Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Saque de " + valor + "reais da conta número " + numero);*/
            notificarClientes(1, valor);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            Operacao operacao = new Operacao(valor, saldo, TipoOperacao.ENTRADA, this);
            operacoes.add(operacao);
            this.saldo += valor;
            /*Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Depósito de " + valor + " reais na conta número " + numero);*/
            notificarClientes(2, valor);
        }
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if (contaDestino != null && saldo >= valor && valor > 0) {
            OperacaoTransferencia operacao = new OperacaoTransferencia(valor, saldo, TipoOperacao.SAIDA, this, contaDestino);
            operacoes.add(operacao);
            this.receberTransferencia(valor, contaDestino);
            /*Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Transferência de " + valor + "reais para a conta número " + contaDestino.getNumero());*/
            contaDestino.receberTransferencia(valor, this);
            notificarClientes(3, valor);
        }
    }

    private void receberTransferencia(double valor, ContaCorrente conta) {
        if (conta != null && conta.getSaldo() >= valor && valor > 0) {
            OperacaoTransferencia operacao = new OperacaoTransferencia(valor, saldo, TipoOperacao.ENTRADA, conta, this);
            operacoes.add(operacao);
            this.saldo -= valor;
            conta.depositar(valor);
            notificarClientes(4, valor);
            /*Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Transferência de " + valor 
            		+ "reais da conta número " + conta.getNumero() 
            		+ "para a conta número" + this.getNumero());*/
        }
    }
    
    public void notificarClientes(int transacao, Double valor) {
        for(Servico servico: servicos) {
            servico.notificar(transacao, this, valor);
        }
    }
    
    public void adicionarServico(Servico servico) {   
        if(servico.getClass().getName().equalsIgnoreCase("Notificacao")) {
            Notificacao not = (Notificacao) servico;
            if (cliente.getClass().getName().equalsIgnoreCase("ClientePessoaFisica") && not.getTipoMensagem() == 3) {
                throw new IllegalArgumentException("Um cliente do tipo pessoa física não pode receber notificações por JMS");
            }
        }
        servicos.add(servico);
    }
    
    public void removerServico(Servico servico) {
        if(servico != null && servicos.contains(servico)) {
            servicos.remove(servico);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public ArrayList<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(ArrayList<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
}
