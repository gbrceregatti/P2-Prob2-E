package problema2.Parte1;
import java.util.ArrayList;

public class ContaCorrente {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private ArrayList<Operacao> operacoes;
    
    public ContaCorrente() {
        operacoes = new ArrayList();
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            Operacao operacao = new Operacao(valor, saldo, TipoOperacao.SAIDA, this);
            operacoes.add(operacao);
            this.saldo -= valor;
            Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Saque de " + valor + "reais para a conta número " + numero);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            Operacao operacao = new Operacao(valor, saldo, TipoOperacao.ENTRADA, this);
            operacoes.add(operacao);
            this.saldo += valor;
             Mensagem mensagem = new Mensagem(cliente);
             mensagem.enviarMensagem("Depósito de " + valor + "reais para a conta número " + numero);
        }
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if (contaDestino != null && saldo >= valor && valor > 0) {
            OperacaoTransferencia operacao = new OperacaoTransferencia(valor, saldo, TipoOperacao.SAIDA, this, contaDestino);
            operacoes.add(operacao);
            this.saldo -= valor;
            Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Transferência de " + valor + "reais para a conta número " + contaDestino.getNumero());
        }
    }

    private void receberTransferencia(double valor, ContaCorrente origem) {
        if (origem != null && origem.getSaldo() >= valor && valor > 0) {
            OperacaoTransferencia operacao = new OperacaoTransferencia(valor, saldo, TipoOperacao.ENTRADA, origem, this);
            operacoes.add(operacao);
            this.saldo += valor;
            Mensagem mensagem = new Mensagem(cliente);
            mensagem.enviarMensagem("Transferência de " + valor + "reais para a conta número " + origem.getNumero());
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(ArrayList<Operacao> operacoes) {
        this.operacoes = operacoes;
    }
}
