package lista4_ex3;

public class ReservaTriplo extends Reserva
{
    private float valorRefeicoes;
    private int numeroRefeicoes;

    public ReservaTriplo()
    {
        this.setValorHospedagemDia(100f);
        this.setValorRefeicoes(10f);
    }

    public float getValorRefeicoes()
    {
        return valorRefeicoes;
    }

    public void setValorRefeicoes(float valorRefeicoes)
    {
        if(valorRefeicoes < 0){
            throw new IllegalArgumentException("Valor para refeições inválido");
        }
        this.valorRefeicoes = valorRefeicoes;
    }

    public int getNumeroRefeicoes()
    {
        return numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes)
    {
        if(numeroRefeicoes < 0){
            throw new IllegalArgumentException("Número de refeições inválido");
        }
        this.numeroRefeicoes = numeroRefeicoes;
    }

    public float calcularValorReserva()
    {
        return this.getValorHospedagemDia() * this.getDiasHospedagem() + this.numeroRefeicoes * this.valorRefeicoes;
    }
}
