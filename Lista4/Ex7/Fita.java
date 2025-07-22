package lista4_ex7;

import java.time.LocalDate;


public abstract class Fita {
    private Cliente cliente;
    private int quantidadeDiasEmprestimo;
    private String nomeFilme;
    private LocalDate data;
    private float valorAluguelDia;

    public Cliente getCliente() {
        if(this.cliente == null){
            throw new IllegalArgumentException("Fita sem cliente");
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

    public int getQuantidadeDiasEmprestimo()
    {
        return this.quantidadeDiasEmprestimo;
    }

    public void setQuantidadeDiasEmprestimo(int quantidadeDiasEmprestimo)
    {
        if(quantidadeDiasEmprestimo <= 0){
            throw new IllegalArgumentException("Dias para empréstimo de fita inválido");
        }
        this.quantidadeDiasEmprestimo = quantidadeDiasEmprestimo;
    }

    public String getNomeFilme()
    {
        if(this.nomeFilme == null){
            throw new IllegalArgumentException("Nome do filme deve ser declarada");
        }
        return this.nomeFilme;
    }

    public void setNomeFilme(String nomeFilme)
    {
        if(nomeFilme == null){
            throw new IllegalArgumentException("Nome de filme inválido");
        }
        this.nomeFilme = nomeFilme;
    }

    public LocalDate getData()
    {
        if(data == null){
            throw new IllegalArgumentException("Data do aluguel deve ser declarada");
        }
        return this.data;
    }

    public void setData(LocalDate data)
    {
        if(data == null){
            throw new IllegalArgumentException("Data de aluguel inválido");
        }
        this.data = data;
    }

    public float getValorAluguelDia()
    {
        return this.valorAluguelDia;
    }

    public void setValorAluguelDia(float valorAluguelDia)
    {
        if(valorAluguelDia < 0){
            throw new IllegalArgumentException("Valor do aluguel diário inválido");
        }
        this.valorAluguelDia = valorAluguelDia;
    }

    public abstract float calcularValorEmprestimoFita();
}
