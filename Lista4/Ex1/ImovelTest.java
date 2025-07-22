package lista4_ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {

    @Test
    void deveAtribuirContribuinteImovel(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        lote.setContribuinte(contribuinte);

        assertEquals(contribuinte, lote.getContribuinte());
    }


    @Test
    void deveRetornarImovelSemContribuinte(){
        Lote lote = new Lote();

        try{
            lote.getContribuinte();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel sem contribuinte", e.getMessage());
        }
    }


    @Test
    void deveRetornarNomeContribuinte(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        contribuinte.setNome("Fernando");
        contribuinte.alocarImovel(lote);

        assertEquals("Fernando", lote.getNomeContribuinte());
    }

    @Test
    void deveRetornarNomeContribuinteVazio(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        contribuinte.alocarImovel(lote);

        try{
            lote.getNomeContribuinte();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveTentarRetornarNomeImovelSemContribuinte(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        try{
            lote.getNomeContribuinte();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel sem contribuinte", e.getMessage());
        }
    }


    @Test
    void deveRetornarCodigoContribuinte(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        contribuinte.setCodigo("0");
        contribuinte.alocarImovel(lote);

        assertEquals("0", lote.getCodigoContribuinte());
    }

    @Test
    void deveRetornarCodigoContribuinteVazio(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        contribuinte.alocarImovel(lote);

        try{
            lote.getCodigoContribuinte();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código vazio", e.getMessage());
        }
    }

    @Test
    void deveTentarRetornarCodigoImovelSemContribuinte(){
        Lote lote = new Lote();
        Contribuinte contribuinte = new Contribuinte();

        try{
            lote.getCodigoContribuinte();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel sem contribuinte", e.getMessage());
        }
    }

}