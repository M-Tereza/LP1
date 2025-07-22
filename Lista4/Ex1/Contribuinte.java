package lista4_ex1;

import java.util.ArrayList;

public class Contribuinte {

    private String nome;
    private String codigo;
    private ArrayList<Imovel> imoveis;

    public Contribuinte() {
        this.imoveis = new ArrayList<Imovel>();
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

    public ArrayList<Imovel> getImoveis() {
        return this.imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void alocarImovel(Imovel imovel){
        imovel.setContribuinte(this);
        this.imoveis.add(imovel);
    }

    public void alocarUnicoImovel(Imovel imovel){
        if(!this.imoveis.contains((imovel))) {
            imovel.setContribuinte(this);
            this.imoveis.add(imovel);
        }
    }

    public void desalocarImovel(Imovel imovel){
        imovel.setContribuinte(null);
        this.imoveis.remove(imovel);
    }

    public int obterQuantidadeImoveis(){
        return this.imoveis.size();
    }

    public boolean verificarImovel(Imovel imovel){
        return this.imoveis.contains(imovel);
    }
}
