package problema2.Parte1;
import problema2.Parte1.Cliente;
import java.util.ArrayList;

public class ContaCorrente {
    
    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private ArrayList<Operacao> operacoes;
    
    public ContaCorrente(){
        operacoes = new ArrayList();
    }
    
    public void sacar(double valor){
        
    }
    
    public void depositar(double valor){
        
    }
    
    public void transferir(double valor, ContaCorrente contaDestino){
        
    }
    
    private void receberTransferencia(double valor, ContaCorrente origem){
        
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
