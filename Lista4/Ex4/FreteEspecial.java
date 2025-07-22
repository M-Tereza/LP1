package lista4_ex4;

public class FreteEspecial extends Frete
{
    private float valorTaxaEntrega;

    public float getValorTaxaEntrega()
    {
        return this.valorTaxaEntrega;
    }

    public void setValorTaxaEntrega(float valorTaxaEntrega)
    {
        if (valorTaxaEntrega < 0){
            throw new IllegalArgumentException("Valor de taxa de entrega inválido");
        }
        this.valorTaxaEntrega = valorTaxaEntrega;
    }

    public float calcularFrete()
    {
        return this.getPrecoBase() + this.valorTaxaEntrega;
    }
}
