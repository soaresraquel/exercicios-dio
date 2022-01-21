package exercicio.dio;

public class Main {

	public static void main(String[] args) {
		// Exerc�cio da calculadora
		System.out.println("------------------");
		System.out.println("   CALCULADORA");
		System.out.println("------------------");
		
		// Adi��o
		Calculadora.somar(10, 35);
		Calculadora.somar(25, 150);
		System.out.println();
		
		// Subtra��o
		Calculadora.subtrair(35, 10);
		Calculadora.subtrair(50, 75);
		System.out.println();
		
		// Multiplica��o
		Calculadora.multiplicar(10, 50);
		Calculadora.multiplicar(7, 35);
		System.out.println();
		
		// Divis�o
		Calculadora.dividir(25, 5);
		Calculadora.dividir(9, 3);
		System.out.println();
		
		// Exerc�cio da mensagem de hora
		System.out.println("------------------");
		System.out.println(" SAUDA��O DE HORA");
		System.out.println("------------------");
		
		Horario.saudacao(8);
		Horario.saudacao(14);
		Horario.saudacao(20);
		
		// Exerc�cio do empr�stimo
		System.out.println("------------------");
		System.out.println(" EMPR�STIMO");
		System.out.println("------------------");
		
		Emprestimo.calcular(50, 2);
		Emprestimo.calcular(245, 3);
	}
}
