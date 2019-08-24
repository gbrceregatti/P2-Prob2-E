package problema2.Parte1;

public class Mensagem {

    private Cliente cliente;
    
    public Mensagem(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void enviarMensagem(String mensagem){
        System.out.println("Cliente " + cliente.getNome()
               + " \n Envio de mensagem por " + cliente.getPreferenciaMensagem() + ": " + mensagem);   
    }
}