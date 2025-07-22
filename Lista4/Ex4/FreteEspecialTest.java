package lista4_ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest
{
    @Test
    void deveRetornarValorTaxaEntrega(){
        FreteEspecial freteEspecial = new FreteEspecial();

        freteEspecial.setValorTaxaEntrega(100f);

        assertEquals(100f, freteEspecial.getValorTaxaEntrega());
    }

    @Test
    void deveTentarValorTaxaEntregaNegativo(){
        FreteEspecial freteEspecial = new FreteEspecial();

        try {
            freteEspecial.setValorTaxaEntrega(-100f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor de taxa de entrega inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularFrete(){
        FreteEspecial freteEspecial = new FreteEspecial();

        freteEspecial.setPrecoBase(100f);
        freteEspecial.setValorTaxaEntrega(25f);

        assertEquals(125f, freteEspecial.calcularFrete());
    }
}