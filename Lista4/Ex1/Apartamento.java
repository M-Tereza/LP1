package lista4_ex1;

import java.lang.Math;

public class Apartamento extends Imovel{
    private float metragemQuadradaApartamento;
    private int andar;
    private float valorMetroQuadradoApartamento = 40.00f;
    private float porcentagemAndar = -10f;

    public float getPorcentagemAndar() {
        return this.porcentagemAndar;
    }

    public void setPorcentagemAndar(float porcentagemAndar) {
        this.porcentagemAndar = porcentagemAndar;
    }

    public float getValorMetroQuadradoApartamento() {
        return this.valorMetroQuadradoApartamento;
    }

    public void setValorMetroQuadradoApartamento(float valorMetroQuadradoApartamento) {
        if(valorMetroQuadradoApartamento<=0) {
            throw new IllegalArgumentException("Valor de metragem inválido");
        } else {
            this.valorMetroQuadradoApartamento = valorMetroQuadradoApartamento;
        }
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        if(andar<0) {
            throw new IllegalArgumentException("Número de andar inválido");
        } else {
            this.andar = andar;
        }
    }

    public float getMetragemQuadradaApartamento() {
        return this.metragemQuadradaApartamento;
    }

    public void setMetragemQuadradaApartamento(float metragemQuadradaApartamento) {
        if(metragemQuadradaApartamento<=0) {
            throw new IllegalArgumentException("Metragem inválida");
        } else {
            this.metragemQuadradaApartamento = metragemQuadradaApartamento;
        }
    }

    public float calcularDescontoTotalAndares()
    {
        if(andar == 0f){
            throw new IllegalArgumentException("Número de andares deve ser declarado");
        } else {
            float descontoTotalAndares = 1f;
            for (int i=0; i<=andar; i++){
                descontoTotalAndares *= (1 + this.porcentagemAndar/100);
            }
            return descontoTotalAndares;
        }
    }

    public float calcularValorImovel()
    {
        if(metragemQuadradaApartamento == 0f) {
            throw new IllegalArgumentException("Metragem deve ser declarada");
        } else {
            return (metragemQuadradaApartamento * valorMetroQuadradoApartamento);
        }
    }
}
