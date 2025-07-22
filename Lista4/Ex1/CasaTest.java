package lista4_ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    @Test
    void deveRetornarMetragemTerreno(){
        Casa casa = new Casa();

        casa.setMetragemQuadradaTerreno(1f);

        assertEquals(1, casa.getMetragemQuadradaTerreno());
    }

    @Test
    void deveTentarMetragemTerrenoNula(){
        try{
            Casa casa = new Casa();
            casa.setMetragemQuadradaTerreno(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem do terreno inválida", e.getMessage());
        }
    }

    @Test
    void deveTentarMetragemTerrenoNegativa(){
        try{
            Casa casa = new Casa();
            casa.setMetragemQuadradaTerreno(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem do terreno inválida", e.getMessage());
        }
    }


    @Test
    void deveTentarRetornarMetragemTerrenoNaoDeclarada(){
        try {
            Casa casa = new Casa();
            casa.getMetragemQuadradaTerreno();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Metragem do terreno deve ser declarada", e.getMessage());
        }
    }


    @Test
    void deveRetornarMetragemConstrucao(){
        Casa casa = new Casa();

        casa.setMetragemQuadradaConstrucao(1f);

        assertEquals(1, casa.getMetragemQuadradaConstrucao());
    }

    @Test
    void deveTentarMetragemConstrucaoNula(){
        try{
            Casa casa = new Casa();
            casa.setMetragemQuadradaConstrucao(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem da construção inválida", e.getMessage());
        }
    }

    @Test
    void deveTentarMetragemConstrucaoNegativa(){
        try{
            Casa casa = new Casa();
            casa.setMetragemQuadradaConstrucao(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem da construção inválida", e.getMessage());
        }
    }


    @Test
    void deveTentarRetornarMetragemConstrucaoNaoDeclarada(){
        try {
            Casa casa = new Casa();
            casa.getMetragemQuadradaConstrucao();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Metragem da construção deve ser declarada", e.getMessage());
        }
    }


    @Test
    void deveRetornarValorMetragemTerreno(){
        Casa casa = new Casa();

        casa.setValorMetroQuadradoTerreno(1f);

        assertEquals(1, casa.getValorMetroQuadradoTerreno());
    }

    @Test
    void deveTentarValorMetragemTerrenoNulo(){
        try{
            Casa casa = new Casa();
            casa.setValorMetroQuadradoTerreno(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor do metro quadrado do terreno inválido", e.getMessage());
        }
    }

    @Test
    void deveTentarValorMetragemTerrenoNegativo(){
        try{
            Casa casa = new Casa();
            casa.setValorMetroQuadradoTerreno(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor do metro quadrado do terreno inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarValorMetragemConstrucao(){
        Casa casa = new Casa();

        casa.setValorMetroQuadradoConstrucao(1f);

        assertEquals(1, casa.getValorMetroQuadradoConstrucao());
    }

    @Test
    void deveTentarValorMetragemConstrucaoNulo(){
        try{
            Casa casa = new Casa();
            casa.setValorMetroQuadradoConstrucao(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor do metro quadrado da construção inválido", e.getMessage());
        }
    }

    @Test
    void deveTentarValorMetragemConstrucaoNegativo(){
        try{
            Casa casa = new Casa();
            casa.setValorMetroQuadradoConstrucao(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor do metro quadrado da construção inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularValorCasa(){
        Casa casa = new Casa();


        casa.setValorMetroQuadradoTerreno(30f);
        casa.setValorMetroQuadradoConstrucao(50f);
        casa.setMetragemQuadradaTerreno(1f);
        casa.setMetragemQuadradaConstrucao(1f);


        assertEquals(80f, casa.calcularValorImovel());
    }

}