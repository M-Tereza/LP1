package lista4_ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarNome(){
        Cliente cliente = new Cliente();

        cliente.setNome("José");

        assertEquals("José", cliente.getNome());
    }

    @Test
    void deveRetornarNomeVazio(){
        Cliente cliente = new Cliente();

        try{
            cliente.getNome();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }


    @Test
    void deveRetornarCodigo(){
        Cliente cliente = new Cliente();

        cliente.setCodigo(20);

        assertEquals(20, cliente.getCodigo());
    }

    @Test
    void deveTentarCodigoNegativo(){
        Cliente cliente = new Cliente();

        try{
            cliente.setCodigo(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }


    @Test
    void deveAtribuirClienteManutencaoUsandoAlocar(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        cliente.alocarManutencao(manutencaoMonitor);

        assertEquals(cliente, manutencaoMonitor.getCliente());
    }


    @Test
    void deveAtribuirClienteManutencaoUsandoAlocarUnico(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        cliente.alocarUnicoManutencao(manutencaoMonitor);

        assertEquals(cliente, manutencaoMonitor.getCliente());
    }


    @Test
    void deveDesatribuirClienteManutencaoUsandoDesalocar(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencaoMonitor = new ManutencaoMonitor();

        cliente.desalocarManutencao(manutencaoMonitor);

        try{
            manutencaoMonitor.getCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Manutenção sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarZeroQuantidadeManutencao(){
        Cliente cliente = new Cliente();

        assertEquals(0, cliente.obterQuantidadeManutencoes());
    }

    @Test
    void deveRetornarUmaQuantidadeManutencao(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao1 = new ManutencaoMonitor();

        cliente.alocarManutencao(manutencao1);

        assertEquals(1, cliente.obterQuantidadeManutencoes());
    }

    @Test
    void deveRetornarDuasQuantidadesManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao1 = new ManutencaoMonitor();
        ManutencaoMonitor manutencao2 = new ManutencaoMonitor();

        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao2);

        assertEquals(2, cliente.obterQuantidadeManutencoes());
    }


    @Test
    void deveAlocarApenasManutencoesDiferentes(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao1 = new ManutencaoMonitor();

        cliente.alocarUnicoManutencao(manutencao1);
        cliente.alocarUnicoManutencao(manutencao1);

        assertEquals(1, cliente.obterQuantidadeManutencoes());
    }


    @Test
    void deveRetornarPresencaManutencaoVerdadeira(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao1 = new ManutencaoMonitor();
        ManutencaoMonitor manutencao2 = new ManutencaoMonitor();
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor();

        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao2);
        cliente.alocarManutencao(manutencao3);

        assertTrue(cliente.verificarManutencao(manutencao2));
    }

    @Test
    void deveRetornarPresencaManutencaoFalsa(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao1 = new ManutencaoMonitor();
        ManutencaoMonitor manutencao2 = new ManutencaoMonitor();
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor();

        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao2);

        assertFalse(cliente.verificarManutencao(manutencao3));
    }


    @Test
    void deveDesalocarManutencao(){
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao1 = new ManutencaoMonitor();
        ManutencaoMonitor manutencao2 = new ManutencaoMonitor();

        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao2);
        cliente.desalocarManutencao(manutencao1);

        assertFalse(cliente.verificarManutencao(manutencao1));
    }

}