package lista4_ex1;

public class Casa extends Imovel{
    private float metragemQuadradaTerreno;
    private float metragemQuadradaConstrucao;
    private float valorMetroQuadradoTerreno;
    private float valorMetroQuadradoConstucao;

    public float getMetragemQuadradaTerreno() {
        return this.metragemQuadradaTerreno;
    }

    public void setMetragemQuadradaTerreno(float metragemQuadradaTerreno) {
        this.metragemQuadradaTerreno = metragemQuadradaTerreno;
    }

    public float getMetragemQuadradaConstrucao() {
        return this.metragemQuadradaConstrucao;
    }

    public void setMetragemQuadradaConstrucao(float metragemQuadradaConstrucao) {
        this.metragemQuadradaConstrucao = metragemQuadradaConstrucao;
    }

    public float getValorMetroQuadradoTerreno() {
        return this.valorMetroQuadradoTerreno;
    }

    public void setValorMetroQuadradoTerreno(float valorMetroQuadradoTerreno) {
        this.valorMetroQuadradoTerreno = valorMetroQuadradoTerreno;
    }

    public float getValorMetroQuadradoConstucao() {
        return this.valorMetroQuadradoConstucao;
    }

    public void setValorMetroQuadradoConstucao(float valorMetroQuadradoConstucao) {
        this.valorMetroQuadradoConstucao = valorMetroQuadradoConstucao;
    }

    public float calcularValorImovel()
    {
        return 0;
    }
}
