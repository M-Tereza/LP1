package lista4_ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoMonitorTest
{
    @Test
    void deveCalcularValorManutencao(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        manutencaoMonitor.setValorMaoDeObra(100f);

        assertEquals(100f, manutencaoMonitor.calcularValorManutencao());
    }
}