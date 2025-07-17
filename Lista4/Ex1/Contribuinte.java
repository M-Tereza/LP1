package lista4_ex1;

import java.util.ArrayList;

public class Contribuinte {
    private ArrayList<Imovel> imoveis;

    public Contribuinte() {
        this.imoveis = new ArrayList<Imovel>();
    }

    public ArrayList<Imovel> getImoveis() {
        return this.imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void alocar(Imovel imovel){
        this.imoveis.add(imovel);
    }

    public void alocarUnico(Imovel imovel){
        if(!this.imoveis.contains((imovel))) {
            this.imoveis.add(imovel);
        }
    }

    public void desalocar(Imovel imovel){
        this.imoveis.remove(imovel);
    }

    public int obterQuantidadeImoveis(){
        return this.imoveis.size();
    }

    public boolean verificarImovel(Imovel imovel){
        return this.imoveis.contains(imovel);
    }
}
