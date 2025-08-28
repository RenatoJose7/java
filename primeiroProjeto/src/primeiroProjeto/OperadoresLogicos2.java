package primeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Classificação do filme
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		
		if(idade < 16 || idade > 70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		// Promoção de produto
		System.out.println("Informe o valor do produto: ");
		double valor = scanner.nextDouble();
		System.out.println("Qual a quantidade comprada? ");
		int quant = scanner.nextInt();
		double valorTotal = valor * quant;
		
		if(valorTotal > 200 && quant > 5) {
			double desc = valorTotal * 0.15;
			double valorFinal = valorTotal - desc;
			System.out.println("O valor com desconto é: "+ valorFinal);
		} else {
			System.out.println("O valor ainda é o mesmo");
		}
		
		// Alerta de saúde
		System.out.println("Informe a frequência cardíaca: ");
		double freq = scanner.nextDouble();
		System.out.println("O paciente sente tontura? ");
		String tontura = scanner.next();
		
		if (freq >= 100 || tontura.equalsIgnoreCase("Sim")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}
		
		// Participação em Concurso

		System.out.print("Qual sua idade? ");
		int idadee = scanner.nextInt();
		System.out.print("É residente do estado? ");
		String resi = scanner.next();

		if (idadee >= 18 && idadee <= 30 && resi.equalsIgnoreCase("sim")) {
		    System.out.println("Elegível para o concurso");
		} else {
		    System.out.println("Não elegível para o concurso");
		}

		System.out.println("\n");
				
		// Recompensa por Desempenho

		System.out.print("Quantos projetos foram concluídos? ");
		int projetos = scanner.nextInt();
		System.out.print("Quantos erros foram reportados? ");
		int erros = scanner.nextInt();

		if (projetos > 10 && erros < 3) {
		    System.out.println("Recompensa concedida");
		} else {
		    System.out.println("Sem recompensa");
		}	
		// Autorização para Viagem

		System.out.print("Qual sua idade? ");
		int idade2 = scanner.nextInt();
		System.out.print("Possui passaporte válido? ");
		String passaporte = scanner.next();

		if (idade2 >= 18 && passaporte.equalsIgnoreCase("sim")) {
		    System.out.println("Viagem autorizada");
		} else {
		    System.out.println("Viagem não autorizada");
		}
		
		// 7 - Aprovação em Curso Online

		System.out.print("Qual sua nota final (0 a 100)? ");
		int nota = scanner.nextInt();
		System.out.print("Quantas aulas assistidas (0 a 50)? ");
		int aulas = scanner.nextInt();

		if (nota >= 70 && aulas >= 40) {
		    System.out.println("Aprovado");
		} else {
		    System.out.println("Reprovado");
		}
		
		// 8 - Controle de Irrigação
		
		System.out.print("Qual a umidade do solo em % ? ");
		int umidade = scanner.nextInt();
		System.out.print("Qual a temperatura em graus celsius? ");
		int temp = scanner.nextInt();

		if (umidade < 30 || temp > 30) {
		    System.out.println("Irrigação necessária");
		} else {
		    System.out.println("Irrigação não necessária");
		}

		// 9 - Inscrição em Feira Profissional
		
		System.out.print("Qual sua idade? ");
		int idd3 = scanner.nextInt();
		System.out.print("Possui experiência prévia? ");
		String exp = scanner.next();

		if (idd3 >= 20 && idd3 <= 40 && exp.equalsIgnoreCase("sim")) {
		    System.out.println("Inscrição aceita");
		} else {
		    System.out.println("Inscrição não permitida");
		}
	}

}
