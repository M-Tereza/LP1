package lista4_ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest
{
    @Test
    void deveAtribuirClienteManutencao(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();
        Cliente cliente = new Cliente();

        manutencaoMonitor.setCliente(cliente);

        assertEquals(cliente, manutencaoMonitor.getCliente());
    }


    @Test
    void deveRetornarManutencaoSemCliente(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        try{
            manutencaoMonitor.getCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Manutenção sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarNomeCliente(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();
        Cliente cliente = new Cliente();

        cliente.setNome("Kelvin");
        cliente.alocarManutencao(manutencaoMonitor);

        assertEquals("Kelvin", manutencaoMonitor.getNomeCliente());
    }

    @Test
    void deveRetornarNomeClienteVazio(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();
        Cliente cliente = new Cliente();

        cliente.alocarManutencao(manutencaoMonitor);

        try{
            manutencaoMonitor.getNomeCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveTentarRetornarNomeManutencaoSemCliente(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();
        Cliente cliente = new Cliente();

        try{
            manutencaoMonitor.getNomeCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Manutenção sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarCodigoCliente(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();
        Cliente cliente = new Cliente();

        cliente.setCodigo(20);
        cliente.alocarManutencao(manutencaoMonitor);

        assertEquals(20, manutencaoMonitor.getCodigoCliente());
    }

    @Test
    void deveTentarRetornarCodigoManutencaoSemCliente(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();
        Cliente cliente = new Cliente();

        try{
            manutencaoMonitor.getCodigoCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Manutenção sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarNumeroManutencaoManutencao(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        manutencaoMonitor.setNumeroManutencao(1);

        assertEquals(1, manutencaoMonitor.getNumeroManutencao());
    }


    @Test
    void deveTentarNegativoNumeroManutencaoManutencao(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        try{
            manutencaoMonitor.setNumeroManutencao(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de manutenção inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarValorMaoDeObra(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        manutencaoMonitor.setValorMaoDeObra(1f);

        assertEquals(1f, manutencaoMonitor.getValorMaoDeObra());
    }

    @Test
    void deveTentarNegativoValorMaoDeObra(){
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        try{
            manutencaoMonitor.setValorMaoDeObra(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor da mão de obra inválido", e.getMessage());
        }
    }
}