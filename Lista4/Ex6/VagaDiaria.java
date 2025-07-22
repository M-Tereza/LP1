package lista4_ex6;

public class VagaDiaria extends Vaga
{
    private int quantidadeDias;
    private float valorDia = 10f;

    public int getQuantidadeDias()
    {
        if (this.quantidadeDias == 0){
            throw new IllegalArgumentException("Quantidade de dias deve ser declarado");
        }
        return this.quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias)
    {
        if (quantidadeDias <= 0){
            throw new IllegalArgumentException("Quantidade de dias inválida");
        }
        this.quantidadeDias = quantidadeDias;
    }

    public float getValorDia()
    {
        return this.valorDia;
    }

    public void setValorDia(float valorDia)
    {
        if (valorDia < 0){
            throw new IllegalArgumentException("Valor diário do aluguel inválida");
        }
        this.valorDia = valorDia;
    }

    public float calcularAluguelVaga(){
        return this.getQuantidadeDias() * this.getValorDia();
    }
}
