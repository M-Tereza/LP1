package lista4_ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest
{
    @Test
    void deveRetornarValorTaxaEntrega(){
        FreteUrgente freteUrgente = new FreteUrgente();

        freteUrgente.setValorTaxaEntrega(100f);

        assertEquals(100f, freteUrgente.getValorTaxaEntrega());
    }

    @Test
    void deveTentarValorTaxaEntregaNegativo(){
        FreteUrgente freteUrgente = new FreteUrgente();

        try {
            freteUrgente.setValorTaxaEntrega(-100f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor de taxa de entrega inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarValorTaxaItem(){
        FreteUrgente freteUrgente = new FreteUrgente();

        freteUrgente.setValorTaxaItem(100f);

        assertEquals(100f, freteUrgente.getValorTaxaItem());
    }

    @Test
    void deveTentarValorTaxaItemNegativo(){
        FreteUrgente freteUrgente = new FreteUrgente();

        try {
            freteUrgente.setValorTaxaItem(-100f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor de taxa por item inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarNumeroItens(){
        FreteUrgente freteUrgente = new FreteUrgente();

        freteUrgente.setNumeroItens(1);

        assertEquals(1, freteUrgente.getNumeroItens());
    }

    @Test
    void deveTentarNumeroItensNegativo(){
        FreteUrgente freteUrgente = new FreteUrgente();

        try {
            freteUrgente.setNumeroItens(-1);
        } catch (IllegalArgumentException e){
            assertEquals("Número de itens inválido", e.getMessage());
        }
    }

    @Test
    void deveTentarNumeroItensNulo(){
        FreteUrgente freteUrgente = new FreteUrgente();

        try {
            freteUrgente.setNumeroItens(-1);
        } catch (IllegalArgumentException e){
            assertEquals("Número de itens inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularFrete(){
        FreteUrgente freteUrgente = new FreteUrgente();

        freteUrgente.setPrecoBase(100f);
        freteUrgente.setValorTaxaEntrega(25f);
        freteUrgente.setValorTaxaItem(10f);
        freteUrgente.setNumeroItens(4);

        assertEquals(165f, freteUrgente.calcularFrete());
    }
}