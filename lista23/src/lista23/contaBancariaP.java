package lista23;

import java.util.Scanner;

public class contaBancariaP {

	public static void main(String[] args) {
		contaBancaria conta = new contaBancaria();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conta bancária");
		System.out.println("------------------------------------");
		
		conta.setTitular("Renato");
		conta.setSaldo(0);
		conta.depositar(30000000);
		conta.sacar(30000000);
		
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Conta: "+ conta.getSaldo());
		
		System.out.println("------------------------------------");
		int escolha;
		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		do {
		System.out.println("\nEscolha uma opção:\n"
				+ "1- Depositar\n"
				+ "2- Sacar\n"
				+ "3- Sair");
		escolha = sc.nextInt();
		switch(escolha) {
		case 1:
			System.out.println("Quanto deseja depositar? ");
			double deposito = sc.nextDouble();
			conta.setSaldo(deposito);
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Conta: "+ conta.getSaldo());
			
			break;
		case 2:
			System.out.println("Quanto deseja sacar? ");
			double valor = sc.nextDouble();
			conta.setSaldo(valor);
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Conta: "+ conta.getSaldo());
			
			break;
			
		case 3:
			System.out.println("Saindo.");
			break;
			
		default:
			System.out.println("Opção inválida.");
			break;
	}
		
	} while (escolha !=3);
		

}}
