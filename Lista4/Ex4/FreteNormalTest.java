package lista4_ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteNormalTest
{
    @Test
    void deveCalcularFrete(){
        FreteNormal freteNormal = new FreteNormal();

        freteNormal.setPrecoBase(100f);

        assertEquals(100f, freteNormal.calcularFrete());
    }
}