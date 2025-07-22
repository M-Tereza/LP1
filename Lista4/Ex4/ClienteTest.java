package lista4_ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarNome(){
        Cliente cliente = new Cliente();

        cliente.setNome("Douglas");

        assertEquals("Douglas", cliente.getNome());
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
    void deveAtribuirClienteFreteUsandoAlocar(){
        Cliente cliente = new Cliente();
        FreteNormal freteNormal = new FreteNormal();

        cliente.alocarFrete(freteNormal);

        assertEquals(cliente, freteNormal.getCliente());
    }


    @Test
    void deveAtribuirClienteFreteUsandoAlocarUnico(){
        Cliente cliente = new Cliente();
        FreteNormal freteNormal = new FreteNormal();

        cliente.alocarUnicoFrete(freteNormal);

        assertEquals(cliente, freteNormal.getCliente());
    }


    @Test
    void deveDesatribuirClienteFreteUsandoDesalocar(){
        Cliente cliente = new Cliente();
        FreteNormal freteNormal = new FreteNormal();

        cliente.desalocarFrete(freteNormal);

        try{
            freteNormal.getCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarZeroQuantidadeFrete(){
        Cliente cliente = new Cliente();

        assertEquals(0, cliente.obterQuantidadeFretes());
    }

    @Test
    void deveRetornarUmaQuantidadeFrete(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();

        cliente.alocarFrete(frete1);

        assertEquals(1, cliente.obterQuantidadeFretes());
    }

    @Test
    void deveRetornarDuasQuantidadesFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();

        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);

        assertEquals(2, cliente.obterQuantidadeFretes());
    }


    @Test
    void deveAlocarApenasFretesDiferentes(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();

        cliente.alocarUnicoFrete(frete1);
        cliente.alocarUnicoFrete(frete1);

        assertEquals(1, cliente.obterQuantidadeFretes());
    }


    @Test
    void deveRetornarPresencaFreteVerdadeira(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();
        FreteNormal frete3 = new FreteNormal();

        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        assertTrue(cliente.verificarFrete(frete2));
    }

    @Test
    void deveRetornarPresencaFreteFalsa(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();
        FreteNormal frete3 = new FreteNormal();

        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);

        assertFalse(cliente.verificarFrete(frete3));
    }


    @Test
    void deveDesalocarFrete(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();

        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.desalocarFrete(frete1);

        assertFalse(cliente.verificarFrete(frete1));
    }

}