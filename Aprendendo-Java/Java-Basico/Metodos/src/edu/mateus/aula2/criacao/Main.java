package edu.mateus.aula2.criacao;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exerxício da Calculadora: ");
        Calculadora.soma(3,12);
        Calculadora.subtracao(10,8);
        Calculadora.multiplicacao(3,7);
        Calculadora.divisao(10,4);

        // Mensagem
        System.out.println("------------------------------");
        System.out.println("Exerxício da Mensagem: ");
        Mensagem.enviarMensagem(9);
        Mensagem.enviarMensagem(16);
        Mensagem.enviarMensagem(3);
        Mensagem.enviarMensagem(40);

        // Emprestimo
        System.out.println("------------------------------");
        System.out.println("Exerxício do Empréstimo: ");
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);
    }
}
