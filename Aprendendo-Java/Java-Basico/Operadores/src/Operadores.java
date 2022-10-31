public class Operadores {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        int numero = 5;

        numero++;
        System.out.println(numero);
        System.out.println(--numero);

        boolean variavel = true;

        System.out.println(!variavel);

        int a,b;
        a = 5;
        b = 6;
        // operador ternário
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
