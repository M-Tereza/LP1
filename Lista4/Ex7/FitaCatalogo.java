package lista4_ex7;

public class FitaCatalogo extends Fita
{
    public FitaCatalogo(){
        this.setValorAluguelDia(5f);
    }

    public float calcularValorEmprestimoFita(){
        return getValorAluguelDia() * getQuantidadeDiasEmprestimo();
    }
}
