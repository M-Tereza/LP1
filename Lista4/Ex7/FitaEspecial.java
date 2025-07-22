package lista4_ex7;

public class FitaEspecial extends Fita
{

    public float calcularValorEmprestimoFita(){
        return getValorAluguelDia() * getQuantidadeDiasEmprestimo();
    }
}
