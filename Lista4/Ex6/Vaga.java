package lista4_ex6;

public abstract class Vaga {
    private Cliente cliente;
    private int numeroVaga;
    private String placaVeiculo;

    public Cliente getCliente() {
        if(this.cliente == null){
            throw new IllegalArgumentException("Vaga sem cliente");
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

    public int getNumeroVaga()
    {
        return this.numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga)
    {
        if(numeroVaga < 0){
            throw new IllegalArgumentException("Número de vaga inválido");
        }
        this.numeroVaga = numeroVaga;
    }

    public String getPlacaVeiculo()
    {
        if(this.placaVeiculo == null){
            throw new IllegalArgumentException("Placa deve ser declarada");
        }
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo)
    {
        if(placaVeiculo == null){
            throw new IllegalArgumentException("Placa inválida");
        }
        this.placaVeiculo = placaVeiculo;
    }

    public abstract float calcularAluguelVaga();
}
