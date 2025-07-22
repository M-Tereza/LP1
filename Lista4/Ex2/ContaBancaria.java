package lista4_ex2;

public abstract class ContaBancaria {
    private Cliente cliente;
    private int numeroConta;
    private float saldo;

    public Cliente getCliente() {
        if(this.cliente == null){
            throw new IllegalArgumentException("Conta bancária sem cliente");
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

    public String getCodigoCliente(){
        Cliente cliente = getCliente();
        return cliente.getCodigo();
    }

    public int getNumeroConta()
    {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta)
    {
        if(numeroConta < 0){
            throw new IllegalArgumentException("Número da conta inválido");
        }
        this.numeroConta = numeroConta;
    }

    public float getSaldo()
    {
        return this.saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public abstract float calcularSaldoDisponivel();
}
