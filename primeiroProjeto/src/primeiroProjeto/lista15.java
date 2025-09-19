package primeiroProjeto;

import java.util.Scanner;

public class lista15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1 - Criando um vetor 

		
		System.out.println("Informe o nome de 5 frutas");
		String[] nomes = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("nome["+i+"]: ");
			nomes[i] = sc.next();
		}
		System.out.println("Frutas escolhidas: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(nomes[i]);
		}
		
		
		// 2 - Vetor de números inteiros
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informe 10 valores inteiros");
		int[] num = new int [10];
		for(int i = 0; i<=9; i++) {
			System.out.println("Valores["+i+"]: ");
			num[i] = sc.nextInt();
		}
		System.out.println("Numeros escolhidos: ");
		for(int s = 0; s<=9; s++) {
			System.out.println(num[s]);
		}
		
		
		// 3 - Mostrando os valores na ordem inversa
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informe 7 valores");
		int[] inv = new int [7];
		for(int i = 0; i<=6; i++) {
			System.out.println("Valores["+i+"]: ");
			inv[i] = sc.nextInt();
		}
		System.out.println("Numeros escolhidos");
		for(int i = 6; i>=0; i--) {
			System.out.println(inv[i]);
		}
		
		// 4 - Maiores que 100
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informe 10 valores inteiros");
		int[] num1 = new int [10];
		for(int i = 0; i<=9; i++) {
			System.out.println("Valores["+i+"]: ");
			num1[i] = sc.nextInt();
		}
		for(int i = 0; i<=9; i++) {
		if(num1[i] > 100) {
			System.out.println(num1[i]);
		}
		}
		
		// 5 - Procurando um valor no vetor
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informe 8 valores");
		int[] val = new int [8];
		for(int i = 0; i<=7; i++) {
			System.out.println("Valores["+i+"]: ");
			val[i] = sc.nextInt();
		}
		System.out.println("Informe mais um valor: ");
		int[] comparativo = new int [1];
		do {
		comparativo[1] = sc.nextInt();
		if(comparativo[1] == val[8])
			System.out.println("Existem valores iguais dentro do vetor");
		
		
		

		// 6 - Nome e idade de 5 pessoas
		
		System.out.println("-------------------------------------------------");
		String[] nomes1 = new String[5]; // Faltava essa linha!
		int[] idades = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes1[i] = sc.next();
			System.out.println("Digite a idade de " + nomes1[i] + ": ");
			idades[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(nomes1[i] + " tem " + idades[i] + " anos");
		}



		// 7 - Identificação de idade
		
		System.out.println("-------------------------------------------------");
		int[] idade10 = new int[10];
		for (int i = 0; i < 10; i++) {
		    System.out.println("Digite a idade " + (i + 1) + ": ");
		    idade10[i] = sc.nextInt();

		    if (idade10[i] < 18) {
		        System.out.println("você é menor de idade");
		    }
		}



		// 8 - Aumento em massa
		
		System.out.println("-------------------------------------------------");
		double[] salarios = new double[7];
		for (int i = 0; i < 7; i++) {
		    System.out.println("Digite o salário da pessoa " + (i + 1) + ": ");
		    salarios[i] = sc.nextDouble();

		    if (salarios[i] <= 2500) {
		        System.out.println("você receberá um aumento");
		    }
		}
	}

}
