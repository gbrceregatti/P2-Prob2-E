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
public class AnaliseFluxo implements Servico {

    @Override
    public void notificar(int transacao, ContaCorrente contaCorrente, Double valor) {
        switch(transacao) {
            case 1:
                //System.out.print("Análise do fluxo da conta corrente: saque de R$" + valor + " na conta " + contaCorrente.getNumero());
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Saque de R$" + valor + " - Serviço de Análise de Fluxo de Caixa");
                break;
            case 2:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Depósito de R$" + valor + " - Serviço de Análise de Fluxo de Caixa");
                break;
            case 3:
                System.out.print("Cliente " + contaCorrente.getCliente().getNome() + ", Conta " + contaCorrente.getNumero() + ", Tranferência de R$" + valor + " - Serviço de Análise de Fluxo de Caixa");
                break;
        }
    }
    
}
