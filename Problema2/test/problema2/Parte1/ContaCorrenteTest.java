package problema2.Parte1;

import org.junit.Assert;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }

    @Test
    public void testDepositar() {
        System.out.println("Testando método depositar");
        double valorEsperado = 100.0;
        ClientePessoaFisica cliente = new ClientePessoaFisica();
        //cliente.setPreferenciaMensagem(PreferenciaMensagem.WHATSAPP);
        cliente.setNome("Fulano");
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero(1);
        conta.setCliente(cliente);
        conta.depositar(100);
        
        Assert.assertEquals(valorEsperado, conta.getSaldo(), 0.1);
    }
    
    @Test
    public void testSacar() {
        System.out.println("Testando método sacar");
        double valorEsperado = 50.0;
        ClientePessoaFisica cliente = new ClientePessoaFisica();
        //cliente.setPreferenciaMensagem(PreferenciaMensagem.WHATSAPP);
        cliente.setNome("Fulano");
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero(1);
        conta.setCliente(cliente);
        conta.depositar(100.0);
        conta.sacar(50.0);
        Assert.assertEquals(valorEsperado, conta.getSaldo(), 0.1);
    }

    @Test
    public void testTransferir() {
        System.out.println("Testando método transferir");
        ClientePessoaFisica cliente1 = new ClientePessoaFisica();
        //cliente1.setPreferenciaMensagem(PreferenciaMensagem.WHATSAPP);
        cliente1.setNome("Fulano");
        ContaCorrente contaCliente1 = new ContaCorrente();
        contaCliente1.setNumero(1);
        contaCliente1.setCliente(cliente1);
        contaCliente1.depositar(100.0);
        
        ClientePessoaFisica cliente2 = new ClientePessoaFisica();
        //cliente2.setPreferenciaMensagem(PreferenciaMensagem.WHATSAPP);
        cliente2.setNome("Fulano");
        ContaCorrente contaCliente2 = new ContaCorrente();
        contaCliente2.setNumero(2);
        contaCliente2.setCliente(cliente2);
        contaCliente2.depositar(100.0);
        
        // Transferido do cliente 1 pro 2 o valor de 50 reais
        contaCliente1.transferir(50.0, contaCliente2);
        
        Assert.assertEquals(150.0, contaCliente2.getSaldo(), 0.1);
        Assert.assertEquals(50.0, contaCliente1.getSaldo(), 0.1); 
    }
}
