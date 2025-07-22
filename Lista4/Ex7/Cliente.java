package lista4_ex7;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int codigo;
    private ArrayList<Fita> fitas;

    public Cliente() {
        this.fitas = new ArrayList<Fita>();
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

    public ArrayList<Fita> getFitas() {
        return this.fitas;
    }

    public void setFitas(ArrayList<Fita> fitas) {
        this.fitas = fitas;
    }

    public void alocarFita(Fita fita){
        fita.setCliente(this);
        this.fitas.add(fita);
    }

    public void alocarUnicoFita(Fita fita){
        if(!this.fitas.contains((fita))) {
            fita.setCliente(this);
            this.fitas.add(fita);
        }
    }

    public void desalocarFita(Fita fita){
        fita.setCliente(null);
        this.fitas.remove(fita);
    }

    public int obterQuantidadeFitas(){
        return this.fitas.size();
    }

    public boolean verificarFita(Fita fita){
        return this.fitas.contains(fita);
    }
}
