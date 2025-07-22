package lista4_ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest
{
    @Test
    void deveAtribuirClienteFrete(){
        FreteNormal reservaNormal = new FreteNormal();
        Cliente cliente = new Cliente();

        reservaNormal.setCliente(cliente);

        assertEquals(cliente, reservaNormal.getCliente());
    }


    @Test
    void deveRetornarFreteSemCliente(){
        FreteNormal reservaNormal = new FreteNormal();

        try{
            reservaNormal.getCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarNomeCliente(){
        FreteNormal reservaNormal = new FreteNormal();
        Cliente cliente = new Cliente();

        cliente.setNome("Geremias");
        cliente.alocarFrete(reservaNormal);

        assertEquals("Geremias", reservaNormal.getNomeCliente());
    }

    @Test
    void deveRetornarNomeClienteVazio(){
        FreteNormal reservaNormal = new FreteNormal();
        Cliente cliente = new Cliente();

        cliente.alocarFrete(reservaNormal);

        try{
            reservaNormal.getNomeCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveTentarRetornarNomeFreteSemCliente(){
        FreteNormal reservaNormal = new FreteNormal();
        Cliente cliente = new Cliente();

        try{
            reservaNormal.getNomeCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarCodigoCliente(){
        FreteNormal reservaNormal = new FreteNormal();
        Cliente cliente = new Cliente();

        cliente.setCodigo(20);
        cliente.alocarFrete(reservaNormal);

        assertEquals(20, reservaNormal.getCodigoCliente());
    }

    @Test
    void deveTentarRetornarCodigoFreteSemCliente(){
        FreteNormal reservaNormal = new FreteNormal();
        Cliente cliente = new Cliente();

        try{
            reservaNormal.getCodigoCliente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete sem cliente", e.getMessage());
        }
    }


    @Test
    void deveRetornarNumeroFrete(){
        FreteNormal reservaNormal = new FreteNormal();

        reservaNormal.setNumero(1);

        assertEquals(1, reservaNormal.getNumero());
    }


    @Test
    void deveTentarNegativoNumeroFrete(){
        FreteNormal reservaNormal = new FreteNormal();

        try{
            reservaNormal.setNumero(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de frete inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarPrecoBase(){
        FreteNormal reservaNormal = new FreteNormal();

        reservaNormal.setPrecoBase(1f);

        assertEquals(1f, reservaNormal.getPrecoBase());
    }

    @Test
    void deveTentarNegativoPrecoBase(){
        FreteNormal reservaNormal = new FreteNormal();

        try{
            reservaNormal.setPrecoBase(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor do preço base do frete inválido", e.getMessage());
        }
    }
}