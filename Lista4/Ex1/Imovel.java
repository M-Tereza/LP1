package lista4_ex1;

public abstract class Imovel {
    private Contribuinte contribuinte;

    public Contribuinte getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public abstract float calcularValorImovel();
}
