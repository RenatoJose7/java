package ex2;

import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {

		Personagem G = new Guerreiro();
		Personagem M = new Mago();
		Personagem C = new Curandeiro();
		
		System.out.println("Estamos na batalha final...");
		System.out.println("Qual será os ultimos ataques dos nossos heróis? \n");
		
		G.realizarAcao();
		M.realizarAcao();
		C.realizarAcao();

		System.out.println("Então...");
		System.out.println("Vencemos!!!");
	}

}
