package lista22;

public class gato {
	String nome;
	String raca;
	int idade;
	
	void miau() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome + " está comendo");
	}
	
	void mostrarInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println();
		System.out.println("Raça: " + raca);
		System.out.println();
		System.out.println("Idade: "+idade);
	}
}

}
