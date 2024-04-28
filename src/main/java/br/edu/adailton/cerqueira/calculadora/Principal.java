package br.edu.adailton.cerqueira.calculadora;

public class Principal {

	public static void main(String[] args) {
		var calculadora = new Calculadora();
		System.out.println("CALCULADORA");
		System.out.println(calculadora.somar(1d, 2d));
	}
}
