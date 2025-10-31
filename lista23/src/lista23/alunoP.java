package lista23;

import java.util.Scanner;

public class alunoP {

	public static void main(String[] args) {
		aluno a = new aluno();
		Scanner sc = new Scanner(System.in);
		
		
		a.setNome ("Renato");
		a.setIdade (17);
		
		System.out.println(a.getNome()+" tem "+a.getIdade()+" anos.");
		
		System.out.println("Informe um nome: ");
		String nome = sc.next();
		System.out.println("Informe a idade: ");
		int idade = sc.nextInt();
		
		a.setIdade(idade);
		a.setNome(nome);
		
		System.out.println(a.getNome()+" tem "+a.getIdade()+" anos.");
		
		
		
	}

}
