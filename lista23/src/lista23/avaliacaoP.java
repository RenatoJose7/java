package lista23;

import java.util.Scanner;

public class avaliacaoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		avaliacao a = new avaliacao();
		
		a.setNome("Renato");
		a.setNota1(8);
		a.setNota2(10);
		int media = ((a.getNota1() + a.getNota2()) / 2 );
		System.out.println("Aluno: "+ a.getNome());
		System.out.println("Nota final: "+ media) ;
	
		
		System.out.println("---------------------------------");
		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		a.setNome(nome);
		System.out.println("Informe a primeira nota: ");
		int nota1 = sc.nextInt();
		a.setNota1(nota1);
		System.out.println("Informe a segunda nota: ");
		int nota2 = sc.nextInt();
		a.setNota2(nota2);
		System.out.println("Aluno: "+ a.getNome());
		media = ((a.getNota1() + a.getNota2()) / 2 );
		System.out.println("Nota final: "+ media) ;
		
		
		
	}

}
