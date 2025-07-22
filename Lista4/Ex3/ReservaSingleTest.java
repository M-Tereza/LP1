package lista4_ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaSingleTest
{
    @Test
    void deveCalcularValorHospedagem(){
        ReservaSingle reservaSingle = new ReservaSingle();

        reservaSingle.setValorHospedagemDia(50f);
        reservaSingle.setDiasHospedagem(10);

        assertEquals(500f, reservaSingle.calcularValorReserva());
    }
}