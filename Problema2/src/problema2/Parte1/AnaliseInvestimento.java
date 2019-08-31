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
public class AnaliseInvestimento implements Servico {
    
    private static AnaliseInvestimento singleton;

    private AnaliseInvestimento() {
    }
    
    public static AnaliseInvestimento getInstance() {
        if (singleton == null) {
            singleton = new AnaliseInvestimento();
        }
        return singleton;
    }
    
    @Override
    public void notificar(int transacao, ContaCorrente contaCorrente, Double valor) {
        switch(transacao) {
            case 2:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Depósito de R$" + valor + " - Serviço de análise de investimento");
                break;
            case 4:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Tranferência tipo entrada de R$" + valor + " - Serviço de análise de investimento");
                break;
        }
    }
    
}
