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
    void deveTentarRetornarMetragemNaoDeclarada(){
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.getMetragemQuadradaApartamento();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Metragem deve ser declarada", e.getMessage());
        }
    }


    @Test
    void deveRetornarAndar(){
        Apartamento apartamento = new Apartamento();

        apartamento.setAndar(0);

        assertEquals(0, apartamento.getAndar());
    }

    @Test
    void deveTentarAndarNegativo(){
        try {
            Apartamento apartamento = new Apartamento();

            apartamento.setAndar(-1);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Número de andar inválido", e.getMessage());
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
    void deveRetornarPorcentagemAndar(){
        Apartamento apartamento = new Apartamento();

        apartamento.setPorcentagemAndar(0f);

        assertEquals(0, apartamento.getPorcentagemAndar());
    }


    @Test
    void deveCalcularValorApartamento(){
        Apartamento apartamento = new Apartamento();

        apartamento.setValorMetroQuadradoApartamento(40f);
        apartamento.setPorcentagemAndar(-10f);
        apartamento.setMetragemQuadradaApartamento(2.5f);
        apartamento.setAndar(1);

        assertEquals(90f, apartamento.calcularValorImovel());
    }
    @Test
    void deveCalcularValorApartamentoAndarZero(){
        Apartamento apartamento = new Apartamento();

        apartamento.setValorMetroQuadradoApartamento(40f);
        apartamento.setPorcentagemAndar(-10f);
        apartamento.setMetragemQuadradaApartamento(2.5f);
        apartamento.setAndar(0);

        assertEquals(100f, apartamento.calcularValorImovel());
    }
}