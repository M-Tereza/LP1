package lista4_ex6;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int codigo;
    private ArrayList<Vaga> vagas;

    public Cliente() {
        this.vagas = new ArrayList<Vaga>();
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

    public ArrayList<Vaga> getVagas() {
        return this.vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }

    public void alocarVaga(Vaga vaga){
        vaga.setCliente(this);
        this.vagas.add(vaga);
    }

    public void alocarUnicoVaga(Vaga vaga){
        if(!this.vagas.contains((vaga))) {
            vaga.setCliente(this);
            this.vagas.add(vaga);
        }
    }

    public void desalocarVaga(Vaga vaga){
        vaga.setCliente(null);
        this.vagas.remove(vaga);
    }

    public int obterQuantidadeVagas(){
        return this.vagas.size();
    }

    public boolean verificarVaga(Vaga vaga){
        return this.vagas.contains(vaga);
    }
}
