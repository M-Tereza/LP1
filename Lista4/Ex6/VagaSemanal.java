package lista4_ex6;

public class VagaSemanal extends Vaga
{
    private int quantidadeSemanas;
    private float valorSemana = 40f;

    public int getQuantidadeSemanas()
    {
        if (this.quantidadeSemanas == 0){
            throw new IllegalArgumentException("Quantidade de semanas deve ser declarado");
        }
        return this.quantidadeSemanas;
    }

    public void setQuantidadeSemanas(int quantidadeSemanas)
    {
        if (quantidadeSemanas <= 0){
            throw new IllegalArgumentException("Quantidade de semanas inválida");
        }
        this.quantidadeSemanas = quantidadeSemanas;
    }

    public float getValorSemana()
    {
        return this.valorSemana;
    }

    public void setValorSemana(float valorSemana)
    {
        if (valorSemana < 0){
            throw new IllegalArgumentException("Valor semanal do aluguel inválida");
        }
        this.valorSemana = valorSemana;
    }

    public float calcularAluguelVaga(){
        return this.getQuantidadeSemanas() * this.getValorSemana();
    }
}
