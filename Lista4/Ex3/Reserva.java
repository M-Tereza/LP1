package lista4_ex3;

public abstract class Reserva {
    private Hospede hospede;
    private float valorHospedagemDia;
    private int diasHospedagem;

    public Hospede getHospede() {
        if(this.hospede == null){
            throw new IllegalArgumentException("Reserva sem hóspede");
        }
        return this.hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public String getNomeHospede(){
        Hospede hospede = getHospede();
        return hospede.getNome();
    }

    public int getCodigoHospede(){
        Hospede hospede = getHospede();
        return hospede.getCodigo();
    }

    public int getDiasHospedagem()
    {
        return this.diasHospedagem;
    }

    public void setDiasHospedagem(int diasHospedagem)
    {
        if(diasHospedagem <= 0){
            throw new IllegalArgumentException("Número de dias para hospedagem inválido");
        }
        this.diasHospedagem = diasHospedagem;
    }

    public float getValorHospedagemDia()
    {
        return this.valorHospedagemDia;
    }

    public void setValorHospedagemDia(float valorHospedagemDia)
    {
        if(valorHospedagemDia < 0){
            throw new IllegalArgumentException("Valor da hospedagem diária inválido");
        }
        this.valorHospedagemDia = valorHospedagemDia;
    }

    public abstract float calcularValorReserva();
}
