package primeiroProjeto;

import java.util.Scanner;

public class Lista9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1 - Contador:
		int cont = 1;
		while(cont <= 10) {
			System.out.println(cont);
			cont++;
		}
		
		// 2 - Contagem regressiva:
		System.out.println("\n------------------\n");
		int conta = 10;
		while(conta >= 1) {
			System.out.println(conta);
			conta--;
		}
		
		// 3 - Sequência numérica:
		System.out.println("\n------------------\n");
		int seq = 0;
		while(seq <= 100) {
			System.out.println(seq);
			seq+=5;
		}
		
		
		// 4 - Mostrando mensagem
		System.out.println("\n------------------\n");
		int vezes = 1;
		while(vezes <= 5) {
			System.out.println("Eu gosto de java");
			vezes ++;
		}
		
		// 5 - Soma de Números Digitados:
		System.out.println("\n------------------\n");
		System.out.println("Informe 5 números: ");
		int num;
		int quant = 1;
		int soma = 0;
		while(quant <= 5) {
			num = scanner.nextInt();
			soma += num;
			quant ++;
		} System.out.println("A quantidade total é: " + soma);
		
		// 6 - Validação de Senha:
		System.out.println("\n------------------\n");
		System.out.println("Informe a senha: ");
		int resp = scanner.nextInt();
		int senha = 1234; // Não consegui colocar o número dentro do while, daí criei a variável
		while (resp != senha) {
			System.out.println("Tente novamente");
			resp = scanner.nextInt();
		}
		System.out.println("Senha correta");
		
		// 7 - Contagem Regressiva:
		System.out.println("\n------------------\n");
		System.out.println("Informe um número positivo: ");
		int reg = scanner.nextInt();
		while(reg >= 1) {
			System.out.println(reg);
			reg--;
		}
		
	}

}
