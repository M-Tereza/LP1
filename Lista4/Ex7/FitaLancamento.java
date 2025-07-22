package lista4_ex7;

public class FitaLancamento extends Fita
{

    public float calcularValorEmprestimoFita(){
        return getValorAluguelDia() * getQuantidadeDiasEmprestimo();
    }
}
