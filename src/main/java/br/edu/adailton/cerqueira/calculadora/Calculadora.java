package br.edu.adailton.cerqueira.calculadora;

public class Calculadora {

	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}
        
        public double potencia(double valor) {
            return valor*valor;
        }
}
