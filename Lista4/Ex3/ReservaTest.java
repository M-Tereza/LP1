package lista4_ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest
{
    @Test
    void deveAtribuirHospedeReserva(){
        ReservaSingle reservaSingle = new ReservaSingle();
        Hospede hospede = new Hospede();

        reservaSingle.setHospede(hospede);

        assertEquals(hospede, reservaSingle.getHospede());
    }


    @Test
    void deveRetornarReservaSemHospede(){
        ReservaSingle reservaSingle = new ReservaSingle();

        try{
            reservaSingle.getHospede();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva sem hóspede", e.getMessage());
        }
    }


    @Test
    void deveRetornarNomeHospede(){
        ReservaSingle reservaSingle = new ReservaSingle();
        Hospede hospede = new Hospede();

        hospede.setNome("Garcia");
        hospede.alocarReserva(reservaSingle);

        assertEquals("Garcia", reservaSingle.getNomeHospede());
    }

    @Test
    void deveRetornarNomeHospedeVazio(){
        ReservaSingle reservaSingle = new ReservaSingle();
        Hospede hospede = new Hospede();

        hospede.alocarReserva(reservaSingle);

        try{
            reservaSingle.getNomeHospede();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveTentarRetornarNomeReservaSemHospede(){
        ReservaSingle reservaSingle = new ReservaSingle();
        Hospede hospede = new Hospede();

        try{
            reservaSingle.getNomeHospede();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva sem hóspede", e.getMessage());
        }
    }


    @Test
    void deveRetornarCodigoHospede(){
        ReservaSingle reservaSingle = new ReservaSingle();
        Hospede hospede = new Hospede();

        hospede.setCodigo(20);
        hospede.alocarReserva(reservaSingle);

        assertEquals(20, reservaSingle.getCodigoHospede());
    }

    @Test
    void deveTentarRetornarCodigoReservaSemHospede(){
        ReservaSingle reservaSingle = new ReservaSingle();
        Hospede hospede = new Hospede();

        try{
            reservaSingle.getCodigoHospede();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva sem hóspede", e.getMessage());
        }
    }


    @Test
    void deveRetornarDiasHopedagem(){
        ReservaSingle reservaSingle = new ReservaSingle();

        reservaSingle.setDiasHospedagem(1);

        assertEquals(1, reservaSingle.getDiasHospedagem());
    }

    @Test
    void deveTentarZeroDiasHopedagem(){
        ReservaSingle reservaSingle = new ReservaSingle();

        try{
            reservaSingle.setDiasHospedagem(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de dias para hospedagem inválido", e.getMessage());
        }
    }

    @Test
    void deveTentarNegativoDiasHopedagem(){
        ReservaSingle reservaSingle = new ReservaSingle();

        try{
            reservaSingle.setDiasHospedagem(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de dias para hospedagem inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarValorHospedagemDia(){
        ReservaSingle reservaSingle = new ReservaSingle();

        reservaSingle.setValorHospedagemDia(1f);

        assertEquals(1f, reservaSingle.getValorHospedagemDia());
    }

    @Test
    void deveTentarValorHospedagemDiaNegativo(){
        ReservaSingle reservaSingle = new ReservaSingle();

        try{
            reservaSingle.setValorHospedagemDia(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor da hospedagem diária inválido", e.getMessage());
        }
    }
}