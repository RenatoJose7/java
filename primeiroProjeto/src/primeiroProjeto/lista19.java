package primeiroProjeto;

import java.util.Scanner;

public class lista19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int valores = sc.nextInt();
		classificando(valores);
		separador();

		System.out.println("Qual sua idade? ");
		int idade = sc.nextInt();
		idade(idade);
		separador();

		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		saudacao(nome);
		separador();

		System.out.println("Informe um número que deseja realizar a tabuada: ");
		int numero = sc.nextInt();
		tabuada(numero);
		separador();

		System.out.println("Informe duas palavras para junta-las:");
		System.out.println("Palavra 1");
		String um = sc.next();
		System.out.println("Palavra 2");
		String dois = sc.next();
		palavras(um, dois);
		separador();

		System.out.println("Informe um número e direi se é par ou impar: ");
		int num1 = sc.nextInt();
		pares(num1);
		separador();

		System.out.println("Informe a temperatura: ");
		int temp = sc.nextInt();
		temperatura(temp);
		separador();
		
		System.out.println("Informe o horário: ");
		String turno = sc.next();
		turno(turno);
		separador();
		
		System.out.println("Informe 3 valores para média: ");
		System.out.println("Valor 1: ");
		int n1= sc.nextInt();
		System.out.println("Valor 2: ");
		int n2= sc.nextInt();
		System.out.println("Valor 3: ");
		int n3= sc.nextInt();
		media(n1,n2,n3);
		separador();


	}

	public static void separador() {
		System.out.println("------------------------------------------------");
	}

	public static void classificando(int valores) {
		if (valores > 0) {
			System.out.println("É um número positivo.");
		} else if (valores < 0) {
			System.out.println("É um número negativo.");
		} else {
			System.out.println("O valor é zero.");
		}
	}

	public static void idade(int idade) {
		if (idade <= 12) {
			System.out.println("Criança");
		} else if (idade < 18) {
			System.out.println("Adolescente");
		} else if (idade <= 50) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
	}

	public static void saudacao(String nome) {
		System.out.println("Olá " + nome + " Seja bem-vinde!");
	}

	public static void tabuada(int numero) {
		for (int t = 1; t <= 10; t++) {
			int tabuada = numero * t;
			System.out.println(numero + "x" + t + "=" + tabuada);
		}
	}

	public static void palavras(String um, String dois) {
		System.out.println(um + " " + dois);
	}

	public static void pares(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("É um número par");
		} else {
			System.out.println("É um número impar");
		}
	}

	public static void temperatura(int temp) {
	if (temp <= 15) {
		System.out.println("Frio");
	} else if (temp < 25) {
		System.out.println("Agradável");
	} else if (temp > 25) {
		System.out.println("Quente");
	} else {
		System.out.println("Número inválido");
	}
	
	}

	public static void turno(String turno) {
		if(turno.equalsIgnoreCase("Manhã")) {
			System.out.println("Bom dia");
		} else if(turno.equalsIgnoreCase("Tarde")) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
	}
	public static void media(int n1, int n2, int n3) {
		int media = ((n1 + n2 + n3) / 3);
		System.out.println("A média é: " +media);
	}
}