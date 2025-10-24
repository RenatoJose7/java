package lista22;

import java.util.Scanner;

public class produtoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		produto prod = new produto();
		
		prod.nome = "Garrafa de agua";
		prod.preco = 250;
		prod.estoque = 500;
		
		prod.mostrarInformacoes();
		prod.vender(30);

		System.out.println("-------------");
		
		prod.nome = "Mouse";
		prod.preco = 30;
		prod.estoque = 25;
		
		prod.mostrarInformacoes();
		prod.vender(3);
		
		System.out.println("-------------");
		
		System.out.println("Informe o nome do produto: ");
		prod.nome = sc.next();
		System.out.println("Informe o preco do produto ");
		prod.preco = sc.nextInt();
		System.out.println("informe a quantidade em estoque: ");
		prod.estoque = sc.nextInt();
		System.out.println("Qual a quantidade será vendida? ");
		prod.vender(sc.nextInt());
		
		prod.mostrarInformacoes();
		
	}

}
