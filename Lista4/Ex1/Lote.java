package lista4_ex1;

public class Lote extends Imovel{
    private float metragemQuadradaTerreno;
    private float valorMetroQuadradoTerreno = 30.00f;

    public float getMetragemQuadradaTerreno() {
        if(this.metragemQuadradaTerreno == 0f) {
            throw new IllegalArgumentException("Metragem deve ser declarada");
        } else {
            return this.metragemQuadradaTerreno;
        }
    }

    public void setMetragemQuadradaTerreno(float metragemQuadradaTerreno) {
        if(metragemQuadradaTerreno<=0) {
            throw new IllegalArgumentException("Metragem inválida");
        } else {
            this.metragemQuadradaTerreno = metragemQuadradaTerreno;
        }
    }

    public float getValorMetroQuadradoTerreno() {
        return this.valorMetroQuadradoTerreno;
    }

    public void setValorMetroQuadradoTerreno(float valorMetroQuadradoTerreno) {
        if(valorMetroQuadradoTerreno<=0) {
            throw new IllegalArgumentException("Valor de metragem inválido");
        } else {
            this.valorMetroQuadradoTerreno = valorMetroQuadradoTerreno;
        }
    }

    public float calcularValorImovel()
    {
            return metragemQuadradaTerreno * valorMetroQuadradoTerreno;
    }
}
