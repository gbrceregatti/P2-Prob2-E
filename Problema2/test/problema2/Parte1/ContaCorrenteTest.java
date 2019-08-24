package problema2.Parte1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }

    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        ContaCorrente instance = new ContaCorrente();
        instance.sacar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double valor = 0.0;
        ContaCorrente instance = new ContaCorrente();
        instance.depositar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTransferir() {
        System.out.println("transferir");
        double valor = 0.0;
        ContaCorrente contaDestino = null;
        ContaCorrente instance = new ContaCorrente();
        instance.transferir(valor, contaDestino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
