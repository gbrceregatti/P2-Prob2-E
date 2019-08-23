package problema2.Parte1;

public class ClientePessoaFisica extends Cliente {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setPreferenciaMensagem(PreferenciaMensagem preferenciaMensagem) {
        if (preferenciaMensagem != PreferenciaMensagem.JMS)
            super.setPreferenciaMensagem(preferenciaMensagem);
        else
            throw new IllegalArgumentException("Um cliente do tipo pessoa física não pode rceber notificações por JMS");
    }
}