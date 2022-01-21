package exercicio.dio;

public class Main {

	public static void main(String[] args) {
		// Exercício da calculadora
		System.out.println("------------------");
		System.out.println("   CALCULADORA");
		System.out.println("------------------");
		
		// Adição
		Calculadora.somar(10, 35);
		Calculadora.somar(25, 150);
		System.out.println();
		
		// Subtração
		Calculadora.subtrair(35, 10);
		Calculadora.subtrair(50, 75);
		System.out.println();
		
		// Multiplicação
		Calculadora.multiplicar(10, 50);
		Calculadora.multiplicar(7, 35);
		System.out.println();
		
		// Divisão
		Calculadora.dividir(25, 5);
		Calculadora.dividir(9, 3);
		System.out.println();
		
		// Exercício da mensagem de hora
		System.out.println("------------------");
		System.out.println(" SAUDAÇÃO DE HORA");
		System.out.println("------------------");
		
		Horario.saudacao(8);
		Horario.saudacao(14);
		Horario.saudacao(20);
		
		// Exercício do empréstimo
		System.out.println("------------------");
		System.out.println(" EMPRÉSTIMO");
		System.out.println("------------------");
		
		Emprestimo.calcular(50, 2);
		Emprestimo.calcular(245, 3);
	}
}
