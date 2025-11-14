package ex4;

public class Salada extends Prato{
	Double preco = 27.90;
	String nome = "Salada Caesar";
	
	@Override
	public void calcularPreco() {
		System.out.println("Nome do prato: "+nome);
		System.out.println("Valor do prato: "+preco);
	}
}
