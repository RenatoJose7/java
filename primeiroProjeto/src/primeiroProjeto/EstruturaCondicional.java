package primeiroProjeto;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Verificar maioridade
		
		System.out.println();
		System.out.println("Verificação de maioridade");
		System.out.println("Qual sua idade? ");
		int idade;
		idade = scanner.nextInt();
		if (idade >= 18) {
			System.out.println("Você tem "+idade+" e é maior de idade");
		} else {
			System.out.println("Você tem "+idade+" e é menor de idade");
		}
		
		// Comparar dois números
		
		System.out.println();
		System.out.println("Comparador de números");
		System.out.println("Informe um número para ser comparado: ");
		double num1, num2;
		num1 = scanner.nextDouble();
		System.out.println("Agora informe o segundo número: ");
		num2 =scanner.nextDouble();
		if(num1 > num2) {
			System.out.println("O primeiro deles é maior. ");
		} else {
			System.out.println("O segundo número é maior ou eles são iguais");
		}
		
		// Aprovação por nota
		
		System.out.println();
		System.out.println("Verificador de aprovação");
		System.out.println("Informe sua nota: ");
		double nota;
		nota = scanner.nextDouble();
		if (nota >= 7) {
			System.out.println("Aprovado! Sua nota foi: "+nota);
		} else {
			System.out.println("Reprovado. Sua nota foi: "+nota);
		}
		
		// Cálculo de frete
		
		System.out.println();
		System.out.println("Calculadora de frete");
		System.out.println("Informe sua distância em km: ");
		double distancia;
		distancia = scanner.nextDouble();
		if (distancia <= 50) {
			System.out.println("O frete custará R$ 10,00");
		} else {
			double frete = distancia * 0.5;
			System.out.println("O frete custará R$:"+frete);
		}
		
		// O número é 10?
		
		System.out.println();
		System.out.println("Informe um número");
		double dez;
		dez = scanner.nextDouble();
		if (dez == 10) {
			System.out.println("O número é 10");
		} else {
			System.out.println("O número não é 10");
		}
		
		// Desconto para Associados
		
		System.out.println();
		System.out.println("Desconto para associados");
		System.out.println("Você é associado a nossa loja? ");
		String loja;
		loja = scanner.next();
		if (loja != "sim") {
			System.out.println("Você tem desconto!");
		} else {
			System.out.println("Você não terá desconto.");
		} 
		
		// Cálculo de bônus por horas extras
		
		System.out.println();
		System.out.println("Calculador de bônus");
		System.out.println("Quantas horas extras foram trabalhadas? ");
		double horas;
		horas = scanner.nextDouble();
		if (horas < 10) {
			double bonus = horas * 20;
			System.out.println("Bônus por hora extra R$: "+bonus);
		} else {
			double bonus = horas * 15;
			System.out.println("Bônus por hora extra R$: "+bonus);
		}
		
	}
	

}
