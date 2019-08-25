package problema2.Parte1;

import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String telFixo;
    private String telCelular;
    private final ArrayList<ContaCorrente> contasCorrentes;
    private PreferenciaMensagem preferenciaMensagem;

    public PreferenciaMensagem getPreferenciaMensagem() {
        return preferenciaMensagem;
    }

    public void setPreferenciaMensagem(PreferenciaMensagem preferenciaMensagem) {
        this.preferenciaMensagem = preferenciaMensagem;
    }

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

    public ArrayList<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    } 
}
