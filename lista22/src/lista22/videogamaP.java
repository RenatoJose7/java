package lista22;

import java.util.Scanner;

public class videogamaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		videogame vg = new videogame();
		
		vg.marca ="Xbox";
		vg.modelo="360";
		vg.ligado=true;
		
		vg.verificarStatus();
		
		System.out.println("-----------");
		
		System.out.println("Qual a marca do videogame? ");
		vg.marca = sc.next();
		System.out.println("Qual o modelo do videogame?");
		vg.marca = sc.next();
		System.out.println("Está ligado? ");
		vg.ligado = sc.nextBoolean();
		
		vg.verificarStatus();
		
		

	}

}
