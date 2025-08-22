package primeiroProjeto;

import java.util.Scanner;

public class Lista06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Intervalo numérico
		
		System.out.println("Informe um número");
		int num1 = scanner.nextInt();
		
		if(num1 >= 10 && num1 <= 20) {
			System.out.println("Número dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		// Acesso à festa
		
		System.out.println("\n\nInforme a idade: ");
		int idade = scanner.nextInt();
		System.out.println("Possui convite? (true/false) ");
		boolean convite = scanner.nextBoolean();
		if(idade >= 18 && convite) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada não permitida");
		}
		
		// Categoria de esporte
		System.out.println("\n\nInforme a idade: ");
		int idade1 = scanner.nextInt();
		if(idade1 < 12 || idade1 > 60) {
			System.out.println("Categoria especial");
		} else {
			System.out.println("Categoria normal");
		}
		
		// Desconto no produto
		System.out.println("\n\n Informe o valor do produto");
		double valor = scanner.nextDouble();
		System.out.println("Informe a forma de pagamento (avista ou cartão)");
		String pagamento = scanner.next();
		if(valor > 100 && pagamento.equalsIgnoreCase("avista") ) {
			double desconto = valor - (valor * 0.10);
			System.out.println("O novo valor é de: "+ desconto);
		} else {
			System.out.println("O valor é: "+valor);
		}
		
		// Triagem médica
		System.out.println("\n\nInforme sua temperatura: ");
		int temp = scanner.nextInt();
		System.out.println("Você tem sintomas? (Sim ou não)");
		String sintoma = scanner.next();
		if(temp > 38 || sintoma.equalsIgnoreCase("Sim")) {
			System.out.println("Recomedan-se buscar um médico");
		} else {
			System.out.println("Sem sinais preocupantes");
		}
		
		//Votação
		System.out.println("\n\nInforme sua idade: ");
		int idade2 = scanner.nextInt();
		System.out.println("Você é brasileiro? (true/false) ");
		boolean br = scanner.nextBoolean();
		if(idade2 > 16 && br) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		
		// Bônus de funcionário
		System.out.println("\n\nQuantas horas extras você possuí? ");
		int extra = scanner.nextInt();
		System.out.println("Qual seu número de faltas");
		int faltas = scanner.nextInt();
		if(extra > 20 && faltas < 5) {
			System.out.println("Você ganhará um bônus!");
		} else {
			System.out.println("Não ganha bônus.");
		}
		
		//Autorização para dirigir 
		System.out.println("Informe a idade: ");
		int idade3 = scanner.nextInt();
		System.out.println("Possuí carta? (true/false)");
		boolean carta = scanner.nextBoolean();
		if(idade3 >= 18 && carta) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}
		
		// Elegibilidade para Bolsa de Estudos
		System.out.println("Qual sua nota média? (0 a 10) ");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100) ");
		int frequencia = scanner.nextInt();
		
		if(nota >= 7 || frequencia >= 75) {
			System.out.println("Bolsa concedida");
		} else {
			System.out.println("Bolsa não concedida");
	}
		// Verificação de Temperatura Ambiente
		System.out.println("Informe qual a temperaura do ambiente atual: ");
		int temp1 = scanner.nextInt();
		System.out.println("E a umidade (&)");
		int umidade = scanner.nextInt();
		if (temp1 < 18 || temp1 > 26 && umidade >= 60) {
			
		}
		
	}
}
