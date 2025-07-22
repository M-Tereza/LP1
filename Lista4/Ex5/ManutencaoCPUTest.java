package lista4_ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoCPUTest
{
    @Test
    void deveRetornarValorTotalPecasTrocadas(){
        ManutencaoCPU manutencaoCPU = new ManutencaoCPU();

        manutencaoCPU.setValorTotalPecasTrocadas(100f);

        assertEquals(100f, manutencaoCPU.getValorTotalPecasTrocadas());
    }

    @Test
    void deveTentarValorTotalPecasTrocadasNegativo(){
        ManutencaoCPU manutencaoCPU = new ManutencaoCPU();

        try {
            manutencaoCPU.setValorTotalPecasTrocadas(-100f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor para o total das peças trocadas inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularManutencao(){
        ManutencaoCPU manutencaoCPU = new ManutencaoCPU();

        manutencaoCPU.setValorMaoDeObra(100f);
        manutencaoCPU.setValorTotalPecasTrocadas(10f);

        assertEquals(110f, manutencaoCPU.calcularValorManutencao());
    }
}