package lista4_ex5;

public abstract class Manutencao {
    private Cliente cliente;
    private int numeroManutencao;
    private float valorMaoDeObra;

    public Cliente getCliente() {
        if(this.cliente == null){
            throw new IllegalArgumentException("Manutenção sem cliente");
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

    public int getNumeroManutencao()
    {
        return this.numeroManutencao;
    }

    public void setNumeroManutencao(int numeroManutencao)
    {
        if(numeroManutencao < 0){
            throw new IllegalArgumentException("Número de manutenção inválido");
        }
        this.numeroManutencao = numeroManutencao;
    }

    public float getValorMaoDeObra()
    {
        return this.valorMaoDeObra;
    }

    public void setValorMaoDeObra(float valorMaoDeObra)
    {
        if(valorMaoDeObra < 0){
            throw new IllegalArgumentException("Valor da mão de obra inválido");
        }
        this.valorMaoDeObra = valorMaoDeObra;
    }

    public abstract float calcularValorManutencao();
}
