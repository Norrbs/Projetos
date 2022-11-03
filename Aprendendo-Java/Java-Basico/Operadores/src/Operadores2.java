public class Operadores2 {

    public static void main(String[] args) {

        double salarioMensal = 8500.50d;
        double mediaSalarial = 10354.73d;

        int quantidadeDependentes = 5;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        System.out.println("Recebe auxílio? " + recebeAuxilio);
    }

}
