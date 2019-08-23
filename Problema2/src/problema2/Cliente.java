/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cliente {
    
    private String nome;
    private String telFixo;
    private String telCelular;
    private final ArrayList<ContaCorrente> contasCorrentes;

    public Cliente() {
        contasCorrentes = new ArrayList();
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }
    
    
    
}
