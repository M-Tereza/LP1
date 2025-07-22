package lista4_ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveRetornarNome(){
        Hospede hospede = new Hospede();

        hospede.setNome("José");

        assertEquals("José", hospede.getNome());
    }

    @Test
    void deveRetornarNomeVazio(){
        Hospede hospede = new Hospede();

        try{
            hospede.getNome();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }


    @Test
    void deveRetornarCodigo(){
        Hospede hospede = new Hospede();

        hospede.setCodigo(20);

        assertEquals(20, hospede.getCodigo());
    }

    @Test
    void deveTentarCodigoNegativo(){
        Hospede hospede = new Hospede();

        try{
            hospede.setCodigo(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }


    @Test
    void deveAtribuirHospedeReservaUsandoAlocar(){
        Hospede hospede = new Hospede();
        ReservaSingle reservaSingle = new ReservaSingle();

        hospede.alocarReserva(reservaSingle);

        assertEquals(hospede, reservaSingle.getHospede());
    }


    @Test
    void deveAtribuirHospedeReservaUsandoAlocarUnico(){
        Hospede hospede = new Hospede();
        ReservaSingle reservaSingle = new ReservaSingle();

        hospede.alocarUnicoReserva(reservaSingle);

        assertEquals(hospede, reservaSingle.getHospede());
    }


    @Test
    void deveDesatribuirHospedeReservaUsandoDesalocar(){
        Hospede hospede = new Hospede();
        ReservaSingle reservaSingle = new ReservaSingle();

        hospede.desalocarReserva(reservaSingle);

        try{
            reservaSingle.getHospede();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva sem hóspede", e.getMessage());
        }
    }


    @Test
    void deveRetornarZeroQuantidadeReserva(){
        Hospede hospede = new Hospede();

        assertEquals(0, hospede.obterQuantidadeReservas());
    }

    @Test
    void deveRetornarUmaQuantidadeReserva(){
        Hospede hospede = new Hospede();
        ReservaSingle reserva1 = new ReservaSingle();

        hospede.alocarReserva(reserva1);

        assertEquals(1, hospede.obterQuantidadeReservas());
    }

    @Test
    void deveRetornarDuasQuantidadesReserva() {
        Hospede hospede = new Hospede();
        ReservaSingle reserva1 = new ReservaSingle();
        ReservaSingle reserva2 = new ReservaSingle();

        hospede.alocarReserva(reserva1);
        hospede.alocarReserva(reserva2);

        assertEquals(2, hospede.obterQuantidadeReservas());
    }


    @Test
    void deveAlocarApenasReservasDiferentes(){
        Hospede hospede = new Hospede();
        ReservaSingle reserva1 = new ReservaSingle();

        hospede.alocarUnicoReserva(reserva1);
        hospede.alocarUnicoReserva(reserva1);

        assertEquals(1, hospede.obterQuantidadeReservas());
    }


    @Test
    void deveRetornarPresencaReservaVerdadeira(){
        Hospede hospede = new Hospede();
        ReservaSingle reserva1 = new ReservaSingle();
        ReservaSingle reserva2 = new ReservaSingle();
        ReservaSingle reserva3 = new ReservaSingle();

        hospede.alocarReserva(reserva1);
        hospede.alocarReserva(reserva2);
        hospede.alocarReserva(reserva3);

        assertTrue(hospede.verificarReserva(reserva2));
    }

    @Test
    void deveRetornarPresencaReservaFalsa(){
        Hospede hospede = new Hospede();
        ReservaSingle reserva1 = new ReservaSingle();
        ReservaSingle reserva2 = new ReservaSingle();
        ReservaSingle reserva3 = new ReservaSingle();

        hospede.alocarReserva(reserva1);
        hospede.alocarReserva(reserva2);

        assertFalse(hospede.verificarReserva(reserva3));
    }


    @Test
    void deveDesalocarReserva(){
        Hospede hospede = new Hospede();
        ReservaSingle reserva1 = new ReservaSingle();
        ReservaSingle reserva2 = new ReservaSingle();

        hospede.alocarReserva(reserva1);
        hospede.alocarReserva(reserva2);
        hospede.desalocarReserva(reserva1);

        assertFalse(hospede.verificarReserva(reserva1));
    }

}