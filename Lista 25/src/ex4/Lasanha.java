package ex4;

public class Lasanha extends Prato{
	Double preco = 24.90;
	String nome = "Lasanha";
	
	@Override
	public void calcularPreco() {
		System.out.println("Nome do prato: "+nome);
		System.out.println("Valor do prato: "+preco);
	}
}
