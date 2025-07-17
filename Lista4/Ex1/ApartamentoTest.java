package lista4_ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {

    @Test
    void deveRetornarMetragem(){
        Apartamento apartamento = new Apartamento();

        apartamento.setMetragemQuadradaApartamento(1f);

        assertEquals(1, apartamento.getMetragemQuadradaApartamento());
    }

    @Test
    void deveTentarMetragemNula(){
        try{
            Apartamento apartamento = new Apartamento();
            apartamento.setMetragemQuadradaApartamento(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem inválida", e.getMessage());
        }
    }

    @Test
    void deveTentarMetragemNegativa(){
        try{
            Apartamento apartamento = new Apartamento();
            apartamento.setMetragemQuadradaApartamento(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Metragem inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarValorMetragem(){
        Apartamento apartamento = new Apartamento();

        apartamento.setValorMetroQuadradoApartamento(1f);

        assertEquals(1, apartamento.getValorMetroQuadradoApartamento());
    }

    @Test
    void deveTentarValorMetragemNulo(){
        try{
            Apartamento apartamento = new Apartamento();
            apartamento.setValorMetroQuadradoApartamento(0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor de metragem inválido", e.getMessage());
        }
    }

    @Test
    void deveTentarValorMetragemNegativo(){
        try{
            Apartamento apartamento = new Apartamento();
            apartamento.setValorMetroQuadradoApartamento(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor de metragem inválido", e.getMessage());
        }
    }

    @Test
    void deveCalcularDescontoTotalAndarZero(){
        Apartamento apartamento = new Apartamento();

        apartamento.setAndar(0);
        apartamento.setMetragemQuadradaApartamento(100f);
    }

    @Test
    void deveRetornarErroAndarNaoDeclarada(){
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.calcularDescontoTotalAndares();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Número de andares deve ser declarado", e.getMessage());
        }
    }
    
//    @Test
//    void deveCalcularValorApartamento(){
//        Apartamento apartamento = new Apartamento();
//
//        apartamento.setMetragemQuadradaApartamento(100f);
//
//        assertEquals(3000f, apartamento.calcularValorImovel());
//    }

    @Test
    void deveRetornarErroMetragemNaoDeclarada(){
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.calcularValorImovel();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Metragem deve ser declarada", e.getMessage());
        }
    }
}