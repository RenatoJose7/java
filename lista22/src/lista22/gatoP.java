package lista22;

import java.util.Scanner;

public class gatoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		gato gato = new gato();
		
		gato.nome = "Melisse";
		gato.raca = "Grande";
		gato.idade = 7;
		gato.mostrarInformacoes();
		
		System.out.println("-----------------");
		
		System.out.println("Qual o nome do pet? ");
		gato.nome = sc.next( );
		gato.comer();
		System.out.println("Qual a idade?");
		gato.idade = sc.nextInt();
		gato.miau();
		System.out.println("Qual a raça do "+gato.nome+"?");
		gato.raca = sc.next();
		gato.mostrarInformacoes();
		
	}

}
