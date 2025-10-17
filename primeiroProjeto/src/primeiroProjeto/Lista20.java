package primeiroProjeto;

import java.util.Scanner;

public class Lista20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		saudacao();
		linha();
		retangulo();
		linha();
		multiplos();
		linha();
		cont();
		linha();
		meses();
		linha();
		parametro();
		linha();
		System.out.println("Informe um número: ");
		int num1 = sc.nextInt();
		disponibilidade(num1);
		linha();
		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		despedida(nome);
		linha();
		System.out.println("Informe o primeiro nome: ");
		String nome1 = sc.next();
		System.out.println("Informe um segundo nome: ");
		String nome2 = sc.next();
		nomes(nome1, nome2);
		linha();
		System.out.println("Informe um número: ");
		int num2 = sc.nextInt();
		maior(num2);
		linha();
		System.out.println("Informe qual é o dia (útil) da semana: ");
		String dia = sc.next();
		saudacao2(dia);
		linha();
		System.out.println("Informe a quantidade disponível no estoque");
		int estoque = sc.nextInt();
		situacao(estoque);
		
		
		
	}
	public static void linha() {
		System.out.println("------------------------------------------------");
	}
	public static void saudacao() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Bom dia!");
		}
	}
	public static void retangulo() {
		System.out.println("*************");
		System.out.println("*************");
		System.out.println("*************");
	}
	public static void multiplos() {
		for(int m = 1; m <= 5; m++) {
			int conta = 5 * m;
			System.out.println("5"+"x"+m+"="+conta);
		}
	}
	public static void cont() {
		for(int i=1; i <= 8; i++) {
			System.out.println(i);
		}
		System.out.println("Pronto!");
	}
	public static void meses() {
		System.out.println("Janeiro");
		System.out.println("Feveireiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
	}
	public static void parametro() {
		System.out.println("Funções com Parâmetro");
	}
	public static void disponibilidade(int num1) {
		if(num1 % 5 == 0) {
			System.out.println("Este número é divisível por 5");
		} else {
			System.out.println("Este número não é divisível por 5");
		}
	}
	public static void despedida(String nome) {
		System.out.println("Até logo "+nome+"!");
	}
	public static void nomes(String Nome1, String nome2) {
		System.out.println(Nome1 +" "+ nome2);
	}
	public static void maior(int num2) {
		if(num2 >= 100) {
			System.out.println("O número é maior que 100: "+num2);
		} else {
			System.out.println("O número é menor que 100");
		}
	}
	public static void velocidade (int vel) {
		if(vel < 40) {
			System.out.println("Lenta");
		} else if (vel < 80) {
			System.out.println("Normal");
		} else {
			System.out.println("Rápida");
		}
	}
	public static void saudacao2 (String dia) {
		System.out.println("Tenha uma ótima "+ dia+"!");
	}
	public static void situacao(int estoque) {
		if(estoque >= 10) {
			System.out.println("Estoque suficiente");
		} else if (estoque > 5) {
			System.out.println("Estoque baixo");
		} else if(estoque < 5) {
			System.out.println("Estoque crítico");
		}
	}
}
