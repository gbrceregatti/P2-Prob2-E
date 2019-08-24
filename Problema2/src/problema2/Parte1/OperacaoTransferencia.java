package problema2.Parte1;


public class OperacaoTransferencia extends Operacao {
    
    private ContaCorrente contaPartida;

    public OperacaoTransferencia(double valor, double saldoAnterior, TipoOperacao tipo, ContaCorrente conta, ContaCorrente contaPartida) {
        super(valor, saldoAnterior, tipo, conta);
        this.contaPartida = contaPartida;
    }

    public ContaCorrente getContaPartida() {
        return contaPartida;
    }

    public void setContaPartida(ContaCorrente contaPartida) {
        this.contaPartida = contaPartida;
    }
}
