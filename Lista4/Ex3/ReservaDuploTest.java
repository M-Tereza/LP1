package lista4_ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaDuploTest
{
    @Test
    void deveRetornarValorRefeicoes(){
        ReservaDuplo reservaDuplo = new ReservaDuplo();

        reservaDuplo.setValorRefeicoes(25f);

        assertEquals(25f, reservaDuplo.getValorRefeicoes());
    }

    @Test
    void deveTentarValorRefeicoesNegativo(){
        ReservaDuplo reservaDuplo = new ReservaDuplo();

        try {
            reservaDuplo.setValorRefeicoes(-10f);
        } catch (IllegalArgumentException e){
            assertEquals("Valor para refeições inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarNumeroRefeicoes(){
        ReservaDuplo reservaDuplo = new ReservaDuplo();

        reservaDuplo.setNumeroRefeicoes(1);

        assertEquals(1, reservaDuplo.getNumeroRefeicoes());
    }

    @Test
    void deveTentarNumeroRefeicoesNegativo(){
        ReservaDuplo reservaDuplo = new ReservaDuplo();

        try {
            reservaDuplo.setNumeroRefeicoes(-1);
        } catch (IllegalArgumentException e){
            assertEquals("Número de refeições inválido", e.getMessage());
        }
    }


    @Test
    void deveCalcularValorHospedagem(){
        ReservaDuplo reservaDuplo = new ReservaDuplo();

        reservaDuplo.setValorHospedagemDia(80f);
        reservaDuplo.setDiasHospedagem(10);
        reservaDuplo.setValorRefeicoes(10f);
        reservaDuplo.setNumeroRefeicoes(2);

        assertEquals(820f, reservaDuplo.calcularValorReserva());
    }
}