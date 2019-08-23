package problema2.Parte1;

import problema2.Parte1.Operacao;
import problema2.Parte1.ContaCorrente;

public class OperacaoTransferencia extends Operacao {
    
    private ContaCorrente contraPartida;

    public ContaCorrente getContraPartida() {
        return contraPartida;
    }

    public void setContraPartida(ContaCorrente contraPartida) {
        this.contraPartida = contraPartida;
    }
}
