package lista4_ex2;

public class ContaCorrenteEspecial extends ContaBancaria
{
    private float valorLimiteCredito;

    public float getValorLimiteCredito()
    {
        return this.valorLimiteCredito;
    }

    public void setValorLimiteCredito(float valorLimiteCredito)
    {
        if (valorLimiteCredito < 0){
            throw new IllegalArgumentException("Valor de limite de crédito inválido");
        }
        this.valorLimiteCredito = valorLimiteCredito;
    }

    public float calcularSaldoDisponivel(){
        return this.getSaldo() + this.getValorLimiteCredito();
    }
}