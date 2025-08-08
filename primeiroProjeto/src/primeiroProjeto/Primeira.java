package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		
		// Declaração de variável
		int idade = 17;
		double salario = 2000.50;
		char letra = 'r';
		String nome = "Renato";
		boolean chuva = false;
		System.out.println(idade);
		System.out.println("O salário é: "+ salario);
		System.out.println("letra: "+ letra);
		System.out.println("o nome é: "+nome);
		System.out.println(chuva);
		
		//Operadores
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2;
		
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: "+ sub);
		System.out.println("Divisão: "+div);
		System.out.println("Multiplicação: "+mult);
		System.out.println("O resto é: "+ resto);
		
		//Entrada de dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá "+ nome1 + "!");
		
		// soma de dois números
		int numero1;
		int numero2;
		System.out.println("Informe um número: ");
		numero1= scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero2= scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: "+soma1);
		
		// Peça o ano de nascimento do usário e mostre quantos anos ele tem
		
		int nasc;
		int ano = 2025;
		System.out.println("Qual o ano de seu nascimento: ");
		nasc = scanner.nextInt();
		int idaden = ano - nasc;
		System.out.println("Você tem: "+ idaden+" Anos de idade!");
		
		// Calcular desconto
		double preco;
		double desconto;
		System.out.println("Qual o valor da compra? ");
		preco = scanner.nextDouble();
		System.out.println("Qual o valor do desconto? ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: "+pagar); 
		
		// Peça duas notas decimais para o usuário, calcule média e mostre
		double nota1;
		double nota2;
		System.out.println("Fale uma nota em valor decimal:" );
		nota1= scanner.nextDouble();
		System.out.println("Informe a segunda nota, também em valor decimal: ");
		nota2= scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua nota final é: "+ media);
	}

}
