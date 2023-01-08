import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente();
        cliente.setValorEmprestimo(1000);
        cliente.setParcelas(12);
        assertEquals(100.83, cliente.calcularValorParcelaEmprestimo(), 2);
    }

}