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
public interface Servico {
       
    public void notificar(int transacao, ContaCorrente contaCorrente, Double valor);
    
}
