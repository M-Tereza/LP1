package lista4_ex4;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int codigo;
    private ArrayList<Frete> fretes;

    public Cliente() {
        this.fretes = new ArrayList<Frete>();
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("Código inválido");
        }
        this.codigo = codigo;
    }

    public ArrayList<Frete> getFretes() {
        return this.fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        this.fretes = fretes;
    }

    public void alocarFrete(Frete frete){
        frete.setCliente(this);
        this.fretes.add(frete);
    }

    public void alocarUnicoFrete(Frete frete){
        if(!this.fretes.contains((frete))) {
            frete.setCliente(this);
            this.fretes.add(frete);
        }
    }

    public void desalocarFrete(Frete frete){
        frete.setCliente(null);
        this.fretes.remove(frete);
    }

    public int obterQuantidadeFretes(){
        return this.fretes.size();
    }

    public boolean verificarFrete(Frete frete){
        return this.fretes.contains(frete);
    }
}
