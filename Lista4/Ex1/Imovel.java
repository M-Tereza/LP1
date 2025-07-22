package lista4_ex1;

public abstract class Imovel {
    private Contribuinte contribuinte;

    public Contribuinte getContribuinte() {
        if(this.contribuinte == null){
            throw new IllegalArgumentException("Imóvel sem contribuinte");
        }
        return this.contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getNomeContribuinte(){
        Contribuinte contribuinte = getContribuinte();
        return contribuinte.getNome();
    }

    public String getCodigoContribuinte(){
        Contribuinte contribuinte = getContribuinte();
        return contribuinte.getCodigo();
    }

    public abstract float calcularValorImovel();
}
