public class Banco {

    public static String formula = "valor / parcelas * 1.21";

    public static double calcularValorParcelaEmprestimo(double valor, int parcelas) {
        String expressao;
        expressao = formula.replace("valor", Double.toString(valor));
        expressao = expressao.replace("parcelas", Integer.toString(parcelas));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
