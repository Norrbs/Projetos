package edu.mateus.aula2.criacao;

/*
Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixas que influenciam nos valores.
 */

public class Emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    private static double getTaxaDuasParcelas() {
        return 0.318;
    }

    private static double getTaxaTresParcelas() {
        return 0.427;
    }

    public static void calcularEmprestimo(double valor, int parcelas) {

        double valorFinal;
        switch (parcelas) {
            case 2:
                valorFinal = valor + valor * getTaxaDuasParcelas();
                System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
                break;
            case 3:
                valorFinal = valor + valor * getTaxaTresParcelas();
                System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
                break;
            default:
                System.out.println("Quantidade de parcelas não aceita.");
                break;
        }

    }

}
