package lista23;

import java.util.Scanner;

public class produtoP {

	public static void main(String[] args) {
		produto p = new produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Classe produto");
		
		p.setNome("Ar-condicionado");
		p.setEstoque(4);
		p.setPreco(3100.00);
		
		System.out.println("Nome: "+ p.getNome() );
		System.out.println("Estoque: "+ p.getEstoque());
		System.out.println("Preço: "+p.getPreco());
		System.out.println("------------------------------");
		
		p.setNome("Máquina de Lavar 12kg");
		p.setEstoque(3);
		p.setPreco(2800.00);
		
		System.out.println("Nome: "+ p.getNome() );
		System.out.println("Estoque: "+ p.getEstoque());
		System.out.println("Preço: "+p.getPreco());
		System.out.println("------------------------------");

		p.setNome("Televisor 55\" 4K");
		p.setEstoque(-5);
		p.setPreco(3700.00);
		
		System.out.println("Nome: "+ p.getNome() );
		System.out.println("Estoque: "+ p.getEstoque());
		System.out.println("Preço: "+p.getPreco());
		System.out.println("------------------------------");

		System.out.println("Informe o nome de um produto: ");
		String nome = sc.next();
		System.out.println("Informe seu estoque: ");
		int estoque = sc.nextInt();
		System.out.println("Informe seu preço: ");
		double preco = sc.nextDouble();
		
		p.setNome(nome);
		p.setEstoque(estoque);
		p.setPreco(preco);
		System.out.println("Nome: "+ p.getNome() );
		System.out.println("Estoque: "+ p.getEstoque());
		System.out.println("Preço: "+p.getPreco());
		System.out.println("------------------------------");
	}

}
