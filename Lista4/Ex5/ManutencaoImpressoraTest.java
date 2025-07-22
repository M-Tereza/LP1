package lista4_ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoImpressoraTest
{
    @Test
    void deveRetornarValorTotalPecasTrocadas(){
        ManutencaoImpressora manutencaoImpressora = new ManutencaoImpressora();

        manutencaoImpressora.setValorTotalPecasTrocadas(100f);

        assertEquals(100f, manutencaoImpressora.getValorTotalPecasTrocadas());
    }

    @Test
    void deveTentarValorTotalPecasTrocadasNegativo(){
        ManutencaoImpressora manutencaoImpressora = new ManutencaoImpressora();

        try {
            manutencaoImpressora.setValorTotalPecasTrocadas(-100f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor para o total das peças trocadas inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularManutencao(){
        ManutencaoImpressora manutencaoImpressora = new ManutencaoImpressora();

        manutencaoImpressora.setValorMaoDeObra(100f);
        manutencaoImpressora.setValorTotalPecasTrocadas(10f);

        assertEquals(110f, manutencaoImpressora.calcularValorManutencao());
    }
}