package lista4_ex4;

public class FreteUrgente extends Frete
{
    private float valorTaxaEntrega;
    private float valorTaxaItem;
    private int numeroItens;

    public FreteUrgente()
    {
        this.setValorTaxaItem(10f);
    }

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

    public float getValorTaxaItem()
    {
        return this.valorTaxaItem;
    }

    public void setValorTaxaItem(float valorTaxaItem)
    {
        if (valorTaxaEntrega < 0){
            throw new IllegalArgumentException("Valor de taxa por item inválido");
        }
        this.valorTaxaItem = valorTaxaItem;
    }

    public int getNumeroItens()
    {
        return this.numeroItens;
    }

    public void setNumeroItens(int numeroItens)
    {
        if (numeroItens <= 0){
            throw new IllegalArgumentException("Número de itens inválido");
        }
        this.numeroItens = numeroItens;
    }

    public float calcularFrete()
    {
        return this.getPrecoBase() + this.valorTaxaEntrega + this.valorTaxaItem * this.numeroItens;
    }
}
