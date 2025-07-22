package lista4_ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTriploTest
{
    @Test
    void deveRetornarValorRefeicoes(){
        ReservaTriplo reservaTriplo = new ReservaTriplo();

        reservaTriplo.setValorRefeicoes(25f);

        assertEquals(25f, reservaTriplo.getValorRefeicoes());
    }

    @Test
    void deveTentarValorRefeicoesNegativo(){
        ReservaTriplo reservaTriplo = new ReservaTriplo();

        try {
            reservaTriplo.setValorRefeicoes(-10f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor para refeições inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarNumeroRefeicoes(){
        ReservaTriplo reservaTriplo = new ReservaTriplo();

        reservaTriplo.setNumeroRefeicoes(1);

        assertEquals(1, reservaTriplo.getNumeroRefeicoes());
    }

    @Test
    void deveTentarNumeroRefeicoesNegativo(){
        ReservaTriplo reservaTriplo = new ReservaTriplo();

        try {
            reservaTriplo.setNumeroRefeicoes(-1);
        } catch (IllegalArgumentException e){
            assertEquals("Número de refeições inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularValorHospedagem(){
        ReservaTriplo reservaTriplo = new ReservaTriplo();

        reservaTriplo.setValorHospedagemDia(100f);
        reservaTriplo.setDiasHospedagem(10);
        reservaTriplo.setValorRefeicoes(10f);
        reservaTriplo.setNumeroRefeicoes(2);

        assertEquals(1020f, reservaTriplo.calcularValorReserva());
    }
}