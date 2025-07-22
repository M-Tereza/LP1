package lista4_ex1;

public class Casa extends Imovel{
    private float metragemQuadradaTerreno;
    private float metragemQuadradaConstrucao;
    private float valorMetroQuadradoTerreno = 30f;
    private float valorMetroQuadradoConstrucao = 50f;

    public float getMetragemQuadradaTerreno() {
        if(this.metragemQuadradaTerreno == 0f) {
            throw new IllegalArgumentException("Metragem do terreno deve ser declarada");
        } else {
            return this.metragemQuadradaTerreno;
        }
    }

    public void setMetragemQuadradaTerreno(float metragemQuadradaTerreno) {
        if(metragemQuadradaTerreno<=0) {
            throw new IllegalArgumentException("Metragem do terreno inválida");
        } else {
            this.metragemQuadradaTerreno = metragemQuadradaTerreno;
        }
    }

    public float getMetragemQuadradaConstrucao() {
        if(this.metragemQuadradaConstrucao == 0f) {
            throw new IllegalArgumentException("Metragem da construção deve ser declarada");
        } else {
            return this.metragemQuadradaConstrucao;
        }
    }

    public void setMetragemQuadradaConstrucao(float metragemQuadradaConstrucao) {
        if(metragemQuadradaConstrucao<=0) {
            throw new IllegalArgumentException("Metragem da construção inválida");
        } else {
            this.metragemQuadradaConstrucao = metragemQuadradaConstrucao;
        }
    }

    public float getValorMetroQuadradoTerreno() {
        return this.valorMetroQuadradoTerreno;
    }

    public void setValorMetroQuadradoTerreno(float valorMetroQuadradoTerreno) {
        if(valorMetroQuadradoTerreno<=0) {
            throw new IllegalArgumentException("Valor do metro quadrado do terreno inválido");
        } else {
            this.valorMetroQuadradoTerreno = valorMetroQuadradoTerreno;
        }
    }

    public float getValorMetroQuadradoConstrucao() {
        return this.valorMetroQuadradoConstrucao;
    }

    public void setValorMetroQuadradoConstrucao(float valorMetroQuadradoConstrucao) {
        if(valorMetroQuadradoConstrucao<=0) {
            throw new IllegalArgumentException("Valor do metro quadrado da construção inválido");
        } else {
            this.valorMetroQuadradoConstrucao = valorMetroQuadradoConstrucao;
        }
    }

    public float calcularValorImovel()
    {
        return metragemQuadradaTerreno * valorMetroQuadradoTerreno + metragemQuadradaConstrucao * valorMetroQuadradoConstrucao;
    }
}
