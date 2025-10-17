package primeiroProjeto;

import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int num2 = sc.nextInt();
		int soma = soma1(num1,num2);
		System.out.println("A soma é: "+ soma1(num1, num2));
		
		linha();
		
		System.out.println("Informe o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int n2 = sc.nextInt();
		int sub = sub(n1,n2);
		System.out.println("A subtração é: "+ sub(n1, n2));
		
		linha();
		
		System.out.println("Informe o primeiro número: ");
		int nu1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int nu2 = sc.nextInt();
		int mult = mult(nu1,nu2);
		System.out.println("A multiplicação é: "+ mult);
		
		linha();
		
		System.out.println("Informe o primeiro número: ");
		int nume1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int nume2 = sc.nextInt();
		int div = div(nume1,nume2);
		System.out.println("A divisão é: "+div);
		
		linha();
		
		System.out.println("Informe a primeiro nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Informe a segundo nota: ");
		int nota2 = sc.nextInt();
		double media = med(nota1, nota2);
		System.out.println("A média é: "+media);
		
		linha();
		
		System.out.println("Informe a primeira nota");
	}
	public static void linha() {
		System.out.println("------------------------------------------------------------");
	}
	public static int soma1 (int num1, int num2) {
		return num1 + num2;
	}
	public static int sub (int n1, int n2) {
		return n1 - n2;
	}
	public static int mult (int nu1, int nu2) {
		return nu1 * nu2;
	}
	public static int div (int nume1, int nume2) {
		return nume1 / nume2;
	}
	public static double med (double nota1, double nota2) {
		if(nota1 == 0 || nota2 == 0) {
			System.out.println("Não é possível dividir por 0");
			return 0;
		} else {
			double media = (nota1 + nota2) / 2;
			return media;
		}
	}
	public static String verificarAprovacao (double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		if (media < 6) {
			return "Reprovado";
		} else {
		return "Aprovado";
	}
	
	}
		
		
		
	

}
