package edu.mateus.aula2.sobrecarga;

/*
Cria uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
Usando sobrecarga.
 */

/**
 * Classe que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
 */

public class Quadrilatero {
    public static void calcularArea(double lado) {
        System.out.println("Área do quadrado: " + (lado * lado));
    }

    public static void calcularArea(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + (lado1 * lado2));
    }

    public static void calcularArea(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura / 2));
    }
}
