package lista4_ex2;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String codigo;
    private ArrayList<ContaBancaria> contasBancarias;

    public Cliente() {
        this.contasBancarias = new ArrayList<ContaBancaria>();
    }

    public String getNome() {
        if(this.nome == null){
            throw new IllegalArgumentException("Nome vazio");
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        if(this.codigo == null){
            throw new IllegalArgumentException("Código vazio");
        }
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<ContaBancaria> getContasBancarias() {
        return this.contasBancarias;
    }

    public void setContasBancarias(ArrayList<ContaBancaria> contasBancarias) {
        this.contasBancarias = contasBancarias;
    }

    public void alocarContaBancaria(ContaBancaria contaBancaria){
        contaBancaria.setCliente(this);
        this.contasBancarias.add(contaBancaria);
    }

    public void alocarUnicoContaBancaria(ContaBancaria contaBancaria){
        if(!this.contasBancarias.contains((contaBancaria))) {
            contaBancaria.setCliente(this);
            this.contasBancarias.add(contaBancaria);
        }
    }

    public void desalocarContaBancaria(ContaBancaria contaBancaria){
        contaBancaria.setCliente(null);
        this.contasBancarias.remove(contaBancaria);
    }

    public int obterQuantidadeContasBancarias(){
        return this.contasBancarias.size();
    }

    public boolean verificarContaBancaria(ContaBancaria contaBancaria){
        return this.contasBancarias.contains(contaBancaria);
    }
}
