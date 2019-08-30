/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2.Parte1;

/**
 *
 * @author User
 */
public class Notificacao implements Servico{
    
    private int tipoMensagem; // WhatsApp = 1, SMS = 2, JMS = 3
    
    public Notificacao(int tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }
    
    @Override
    public void notificar(int transacao, ContaCorrente contaCorrente, Double valor) {
        switch(transacao) {
            case 1:
                //System.out.print("Análise do fluxo da conta corrente: saque de R$" + valor + " na conta " + contaCorrente.getNumero());
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Saque de R$" + valor + " - Serviço de notificação das operações realizadas por " + getTipoMensagemStr());
                break;
            case 2:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Depósito de R$" + valor + " - Serviço de notificação das operações realizadas" + getTipoMensagemStr());
                break;
            case 3:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Tranferência tipo saida de R$" + valor + " - Serviço de notificação das operações realizadas" + getTipoMensagemStr());
                break;
            case 4:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Tranferência tipo entrada de R$" + valor + " - Serviço de notificação das operações realizadas" + getTipoMensagemStr());
                break;
        }
    }
    
    public String getTipoMensagemStr() {
        switch(tipoMensagem) {
            case 1: return "WhatsApp";
            case 2: return "SMS";
            case 3: return "JMS";
        }
        return "WhatsApp";
    }

    public int getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(int tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

}
