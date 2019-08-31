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
public class OfertaFinanciamento implements Servico {
    
    private static OfertaFinanciamento singleton;

    private OfertaFinanciamento() {
    }
    
    public static OfertaFinanciamento getInstance() {
        if (singleton == null) {
            singleton = new OfertaFinanciamento();
        }
        return singleton;
    }
    
    @Override
    public void notificar(int transacao, ContaCorrente contaCorrente, Double valor) {
        switch(transacao) {
            case 1:
                //System.out.print("Análise do fluxo da conta corrente: saque de R$" + valor + " na conta " + contaCorrente.getNumero());
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Saque de R$" + valor + " - Serviço de oferta de financiamento");
                break;
            case 3:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Tranferência tipo saida de R$" + valor + " - Serviço de oferta de financiamento");
                break;
        }
    }
    
}
