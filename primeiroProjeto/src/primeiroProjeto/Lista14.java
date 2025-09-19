package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1 - Contador
		
		for(int cont = 0; cont <= 10; cont++) {
			System.out.println(cont);
		}
		
		// 2 - Somando números de 1 a 100
		
		System.out.println("-------------------------------------------------");
		int soma = 0;
		for(int cont = 0; cont <= 100; cont ++) {
			soma += cont;
			System.out.println(soma);
		}
		
		// 3 - Imprimir números pares de 1 a 20
		
		System.out.println("-------------------------------------------------");
		for(int i = 0; i <= 20; i++) {
			int div = i % 2;
			if(div == 0 ) {
				System.out.println(i);
			} 
		}
		
		// 4 - Imprimir a tabuada de um número
		
		System.out.println("-------------------------------------------------");
		int mult;
		System.out.println("Informe um valor: ");
		mult = sc.nextInt();
		for(int i = 1; i <= 10; i ++) {
			int conta = mult * i;
			System.out.println(mult +" x "+i+" = "+conta);
		}
		
		// 5 - Contar números divisíveis por 3
		
		System.out.println("-------------------------------------------------");
		int contdiv = 0;
		for(int i = 1; i <= 50; i++) {
			int div = i % 3;
			if(div == 0 ) {
				contdiv++;
			} 
		} System.out.println("A quantidade é: "+contdiv);
		
		// 6 - Imprimir números ímpares de 1 a N
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		int contdiv1 = 0;
		for(int i = 1; i <= num; i++) {
			int div = i % 2;
			if(div != 0 ) {
				System.out.println(i);
			} 
		} 
		
		// 7 - Multiplicação de valores
		
		System.out.println("-------------------------------------------------");
		int m = 1;
		for(int p = 1; p <= 5; p ++) {
			System.out.println("Informe o "+p+"° valor");
			int cont = sc.nextInt();
			m = cont * m;
			System.out.println("O resultado é: " + m);
			
		}
		
		// 8 - Premiação da empresa
		
		System.out.println("-------------------------------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o tempo de empresa do funcionário " + i + " (em anos):");
			int anos = sc.nextInt();
			if (anos > 10) {
				System.out.println("Parabéns! Você irá receber um prêmio.");
			} else {
				System.out.println("Quase lá.");
			}
		}



	}

}
