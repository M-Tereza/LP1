package lista4_ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveRetornarZeroImoveis(){
        Contribuinte contribuinte = new Contribuinte();

        assertEquals(0, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveRetornarUmImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();

        contribuinte.alocar(lote1);

        assertEquals(1, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveRetornarDoisImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();

        contribuinte.alocar(lote1);
        contribuinte.alocar(lote2);

        assertEquals(2, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveRetornarUmImovelUnico(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();

        contribuinte.alocarUnico(lote1);
        contribuinte.alocarUnico(lote1);

        assertEquals(1, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveDesalocarImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();

        contribuinte.alocar(lote1);
        contribuinte.alocar(lote2);
        contribuinte.desalocar(lote1);

        assertFalse(contribuinte.verificarImovel(lote1));
    }

    @Test
    void deveRetornarDoisImoveisUnicos(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();

        contribuinte.alocarUnico(lote1);
        contribuinte.alocarUnico(lote2);
        contribuinte.alocarUnico(lote2);

        assertEquals(2, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    void deveRetornarPresencaImovelVerdadeira(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();
        Lote lote3 = new Lote();

        contribuinte.alocar(lote1);
        contribuinte.alocar(lote2);
        contribuinte.alocar(lote3);

        assertTrue(contribuinte.verificarImovel(lote2));
    }

    @Test
    void deveRetornarPresencaImovelFalsa(){
        Contribuinte contribuinte = new Contribuinte();
        Lote lote1 = new Lote();
        Lote lote2 = new Lote();
        Lote lote3 = new Lote();

        contribuinte.alocar(lote1);
        contribuinte.alocar(lote2);

        assertFalse(contribuinte.verificarImovel(lote3));
    }

}