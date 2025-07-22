package lista4_ex4;

public abstract class Frete {
    private Cliente cliente;
    private int numero;
    private float precoBase;

    public Cliente getCliente() {
        if(this.cliente == null){
            throw new IllegalArgumentException("Frete sem cliente");
        }
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNomeCliente(){
        Cliente cliente = getCliente();
        return cliente.getNome();
    }

    public int getCodigoCliente(){
        Cliente cliente = getCliente();
        return cliente.getCodigo();
    }

    public int getNumero()
    {
        return this.numero;
    }

    public void setNumero(int numero)
    {
        if(numero < 0){
            throw new IllegalArgumentException("Número de frete inválido");
        }
        this.numero = numero;
    }

    public float getPrecoBase()
    {
        return this.precoBase;
    }

    public void setPrecoBase(float precoBase)
    {
        if(precoBase < 0){
            throw new IllegalArgumentException("Valor do preço base do frete inválido");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularFrete();
}
