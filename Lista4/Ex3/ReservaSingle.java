package lista4_ex3;

public class ReservaSingle extends Reserva
{
    public ReservaSingle()
    {
        this.setValorHospedagemDia(50f);
    }

    public float calcularValorReserva()
    {
        return this.getValorHospedagemDia() * this.getDiasHospedagem();
    }
}
