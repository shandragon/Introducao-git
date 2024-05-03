package br.edu.adailton.cerqueira.calculadora;

public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("CALCULADORA");
        System.out.println("Somando: " + calculadora.somar(1d, 2d));
        System.out.println("Subtraindo: " + calculadora.subtrair(1d, 2d));
    }
}
