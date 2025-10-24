package lista22;

import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza piz = new Pizza();
		
		piz.sabor = "Calabresa";
		piz.tamanho = "Grande";
		piz.bordaRecheada = true;
		piz.mostrarInformacoes();
		
		System.out.println("-----------------");
		
		System.out.println("Informe o sabor: ");
		piz.sabor = sc.next();
		System.out.println("Informe o tamanho: ");
		piz.tamanho = sc.next();
		System.out.println("Possuí borda recheada? (true or false)");
		piz.bordaRecheada = sc.nextBoolean();
		
		piz.mostrarInformacoes();
		
	}

}
