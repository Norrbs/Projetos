package edu.mateus.aula2.criacao;

/*
A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
 */

public class Mensagem {

    public static void enviarMensagem(int horaDoDia) {
        if (horaDoDia >= 5 && horaDoDia <= 12)
            mensagemBomDia();
        else if (horaDoDia > 12 && horaDoDia <= 17)
            mensagemBoaTarde();
        else if ((horaDoDia > 17 && horaDoDia < 24) || (horaDoDia >= 0 && horaDoDia < 5))
            mensagemBoaNoite();
        else
            System.out.println("Horário inválido!!!");
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }
}
