package lista4_ex6;

public class VagaMensal extends Vaga
{
    private int quantidadeMeses;
    private float valorMes = 150f;

    public int getQuantidadeMeses()
    {
        if (this.quantidadeMeses == 0){
            throw new IllegalArgumentException("Quantidade de meses deve ser declarado");
        }
        return this.quantidadeMeses;
    }

    public void setQuantidadeMeses(int quantidadeMeses)
    {
        if (quantidadeMeses <= 0){
            throw new IllegalArgumentException("Quantidade de meses inválida");
        }
        this.quantidadeMeses = quantidadeMeses;
    }

    public float getValorMes()
    {
        return this.valorMes;
    }

    public void setValorMes(float valorMes)
    {
        if (valorMes < 0){
            throw new IllegalArgumentException("Valor mensal do aluguel inválida");
        }
        this.valorMes = valorMes;
    }

    public float calcularAluguelVaga(){
        return this.getQuantidadeMeses() * this.getValorMes();
    }
}
