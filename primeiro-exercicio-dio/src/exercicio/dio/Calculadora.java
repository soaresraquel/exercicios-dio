package exercicio.dio;

public class Calculadora {
	
	public static void somar(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		System.out.println("Resultado da soma: " + resultado);
	}
	public static void subtrair(int numero1, int numero2) {
		
		int resultado = numero1 - numero2;
		System.out.println("Resultado da subtração: " + resultado);
	}
	public static void multiplicar(int numero1, int numero2) {
		
		int resultado = numero1 * numero2;
		System.out.println("Resultado da multiplicação: " + resultado);
	}
	public static void dividir(int numero1, int numero2) {
		
		int resultado = numero1 / numero2;
		System.out.println("Resultado da divisão: " + resultado);
	}
}
