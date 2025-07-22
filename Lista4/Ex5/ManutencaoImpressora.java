package lista4_ex5;

public class ManutencaoImpressora extends Manutencao
{
    private float valorTotalPecasTrocadas;

    public float getValorTotalPecasTrocadas()
    {
        return this.valorTotalPecasTrocadas;
    }

    public void setValorTotalPecasTrocadas(float valorTotalPecasTrocadas)
    {
        if (valorTotalPecasTrocadas < 0){
            throw new IllegalArgumentException("Valor para o total das peças trocadas inválido");
        }
        this.valorTotalPecasTrocadas = valorTotalPecasTrocadas;
    }

    public float calcularValorManutencao()
    {
        return this.getValorMaoDeObra() + this.valorTotalPecasTrocadas;
    }
}
