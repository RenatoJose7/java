package ex4;

public class Restaurante {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao rest-aurent");
		System.out.println("Cardápio:\n");
		
		Prato lasanha = new Lasanha();
		Prato pizza = new Pizza();
		Prato salada = new Salada();
		
		lasanha.calcularPreco();
		System.out.println();
		pizza.calcularPreco();
		System.out.println();
		salada.calcularPreco();
		

	}

}
