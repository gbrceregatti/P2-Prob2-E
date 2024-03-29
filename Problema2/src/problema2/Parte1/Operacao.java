package problema2.Parte1;
import problema2.Parte1.ContaCorrente;
import java.util.Date;

public class Operacao {
    private double valor;
    private double saldoAnterior;
    private TipoOperacao tipo;
    private ContaCorrente conta;
    private Date data;

    public Operacao(double valor, double saldoAnterior, TipoOperacao tipo, ContaCorrente conta) {
        this.valor = valor;
        this.saldoAnterior = saldoAnterior;
        this.tipo = tipo;
        this.conta = conta;
        this.data = new Date();
    }

   
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
