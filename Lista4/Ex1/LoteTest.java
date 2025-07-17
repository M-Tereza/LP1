package lista4_ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoteTest {

    @Test
    void deveRetornarMetragem(){
        Lote lote = new Lote();

        lote.setMetragemQuadradaTerreno(1f);

        assertEquals(1, lote.getMetragemQuadradaTerreno());
    }

    @Test
    void deveTentarMetragemNula(){
        try{
            Lote lote = new Lote();
            lote.setMetragemQuadradaTerreno(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem inválida", e.getMessage());
        }
    }

    @Test
    void deveTentarMetragemNegativa(){
        try{
            Lote lote = new Lote();
            lote.setMetragemQuadradaTerreno(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarValorMetragem(){
        Lote lote = new Lote();

        lote.setValorMetroQuadradoTerreno(1f);

        assertEquals(1, lote.getValorMetroQuadradoTerreno());
    }

    @Test
    void deveTentarValorMetragemNulo(){
        try{
            Lote lote = new Lote();
            lote.setValorMetroQuadradoTerreno(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor de metragem inválido", e.getMessage());
        }
    }

    @Test
    void deveTentarValorMetragemNegativo(){
        try{
            Lote lote = new Lote();
            lote.setValorMetroQuadradoTerreno(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor de metragem inválido", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorLote(){
        Lote lote = new Lote();

        lote.setMetragemQuadradaTerreno(100f);

        assertEquals(3000f, lote.calcularValorImovel());
    }

    @Test
    void deveRetornarErroMetragemNaoDeclarada(){
        try {
            Lote lote = new Lote();
            lote.calcularValorImovel();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Metragem deve ser declarada", e.getMessage());
        }
    }
}