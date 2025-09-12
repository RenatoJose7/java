package primeiroProjeto;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Contador
		int contador = 10;
		while(contador <= 30) {
			System.out.println(contador);
			contador ++;
		}
		
		
		System.out.println("--------------------------------------");
		// Soma dos números digitados
		System.out.println("Soma dos números digitados");
		int contador2 = 1;
		int soma = 0;
		
		while(contador2 <= 3) {
			System.out.println("Digite o "+ contador2 +":" );
			int numero = sc.nextInt();
			soma = soma + numero;
			contador2 ++;
		}
		System.out.println("O resultado é: "+soma);
		
		
		// Multiplicação por número digitado
		System.out.println("--------------------------------------");
		System.out.println("Informe 5 números para multiplicação");
		int contador3 = 1;
		int soma2 = 1;
		
		while(contador3 <= 5) {
			System.out.println("Digite o "+contador3+":");
			int mult = sc.nextInt();
			soma2 = soma2 * mult;
			contador3++;
		}
		System.out.println("O resultado é: "+soma2);
		
		// Contar até o número informado
		System.out.println("--------------------------------------");
		System.out.println("Informe um número inteiro");
		int num1=sc.nextInt();
		int contador4 = 1;
		
		while(contador4 <= num1) {
			System.out.println(contador4);
			contador4++;
		}
		
		//Somar os números de 1 a 5
		System.out.println("--------------------------------------");
		System.out.println("Soma de 1 a 5");
		int contador5 = 1;
		int soma3 = 0;
		while(contador5 <= 5) {
			soma3 = soma3 + contador5;
			contador5++;
		}
		System.out.println("O resultado da soma é: " + soma3);
		
		// Tabuada
		System.out.println("--------------------------------------");
		System.out.println("Tabuada do número desejado");
		int contador6 = 1;
		int tabuada = sc.nextInt();
		while(contador6 <= 10) {
			int multi = tabuada * contador6;
			System.out.println(tabuada +"*"+contador6+"="+multi);
			contador6++;
			
		}
	}

}
