package edu.mateus.sintaxe;

public class MinhaClass {

    public static void main (String [] args) {
        String primeiroNome = "Mateus";
        String segundoNome = "Norberto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
       return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
