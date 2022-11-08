/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int media;

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;

            count++;
        } while (count < 5);

        media = soma/5;

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + media);
    }
}
