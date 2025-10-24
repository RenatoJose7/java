package lista22;

import java.util.Scanner;

public class musicaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		musica msc = new musica();
		
		msc.titulo = "333";
		msc.artista = "Matue";
		msc.duracao = 4;
		
		msc.mostrarDetalhes(); 
		System.out.println("---------------");
		
		msc.titulo = "P do Pecado";
		msc.artista = "Menos é mais";
		msc.duracao = 3;
		
		msc.mostrarDetalhes(); 
		System.out.println("---------------");
		
		msc.titulo = "Será que é amor";
		msc.artista = "Arlindo cruz";
		msc.duracao = 5;
		
		msc.mostrarDetalhes();
		
		System.out.println("----------------");
		
		System.out.println("Informe o nome da musica: ");
		msc.pausar();
		msc.titulo = sc.next();
		System.out.println("Informe o artista: ");
		msc.artista = sc.next();
		msc.tocar();
		System.out.println("Informe a duração da musica: (em minutos)");
		msc.duracao = sc.nextInt();
		
		msc.mostrarDetalhes(); 

	}

}
