package lista4_ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveRetornarNome(){
        Contribuinte contribuinte = new Contribuinte();

        contribuinte.setNome("Paulo");

        assertEquals("Paulo", contribuinte.getNome());
    }

    @Test
    void deveRetornarNomeVazio(){
        Contribuinte contribuinte = new Contribuinte();

        try{
            contribuinte.getNome();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarCodigo(){
        Contribuinte contribuinte = new Contribuinte();

        contribuinte.setCodigo("AAA000");

        assertEquals("AAA000", contribuinte.getCodigo());
    }

    @Test
    void deveRetornarCodigoVazio(){
        Contribuinte contribuinte = new Contribuinte();

        try{
            contribuinte.getCodigo();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código vazio", e.getMessage());
        }
    }


    @Test
    void deveAtribuirContribuinteImovelUsandoAlocar(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote = new Lote();

        contribuinte.alocarImovel(lote);

        assertEquals(contribuinte, lote.getContribuinte());
    }


    @Test
    void deveAtribuirContribuinteImovelUsandoAlocarUnico(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote = new Lote();

        contribuinte.alocarUnicoImovel(lote);

        assertEquals(contribuinte, lote.getContribuinte());
    }


    @Test
    void deveDesatribuirContribuinteImovelUsandoDesalocar(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote = new Lote();

        contribuinte.desalocarImovel(lote);

        try{
            lote.getContribuinte();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel sem contribuinte", e.getMessage());
        }
    }

    
    @Test
    void deveRetornarZeroQuantidadeImovel(){
        Contribuinte contribuinte = new Contribuinte();

        assertEquals(0, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveRetornarUmaQuantidadeImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();

        contribuinte.alocarImovel(lote1);

        assertEquals(1, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveRetornarDuasQuantidadesImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();

        contribuinte.alocarImovel(lote1);
        contribuinte.alocarImovel(lote2);

        assertEquals(2, contribuinte.obterQuantidadeImoveis());
    }

    
    @Test
    void deveAlocarApenasImoveisDiferentes(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();

        contribuinte.alocarUnicoImovel(lote1);
        contribuinte.alocarUnicoImovel(lote1);

        assertEquals(1, contribuinte.obterQuantidadeImoveis());
    }
    

    @Test
    void deveRetornarPresencaImovelVerdadeira(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();
        Lote lote3 = new Lote();

        contribuinte.alocarImovel(lote1);
        contribuinte.alocarImovel(lote2);
        contribuinte.alocarImovel(lote3);

        assertTrue(contribuinte.verificarImovel(lote2));
    }

    @Test
    void deveRetornarPresencaImovelFalsa(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();
        Lote lote3 = new Lote();

        contribuinte.alocarImovel(lote1);
        contribuinte.alocarImovel(lote2);

        assertFalse(contribuinte.verificarImovel(lote3));
    }

    
    @Test
    void deveDesalocarImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();

        contribuinte.alocarImovel(lote1);
        contribuinte.alocarImovel(lote2);
        contribuinte.desalocarImovel(lote1);

        assertFalse(contribuinte.verificarImovel(lote1));
    }

}