package lista4_ex5;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int codigo;
    private ArrayList<Manutencao> manutencoes;

    public Cliente() {
        this.manutencoes = new ArrayList<Manutencao>();
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

    public ArrayList<Manutencao> getManutencoes() {
        return this.manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public void alocarManutencao(Manutencao manutencao){
        manutencao.setCliente(this);
        this.manutencoes.add(manutencao);
    }

    public void alocarUnicoManutencao(Manutencao manutencao){
        if(!this.manutencoes.contains((manutencao))) {
            manutencao.setCliente(this);
            this.manutencoes.add(manutencao);
        }
    }

    public void desalocarManutencao(Manutencao manutencao){
        manutencao.setCliente(null);
        this.manutencoes.remove(manutencao);
    }

    public int obterQuantidadeManutencoes(){
        return this.manutencoes.size();
    }

    public boolean verificarManutencao(Manutencao manutencao){
        return this.manutencoes.contains(manutencao);
    }
}
