package ex4;

public class Pizza extends Prato{

	Double preco = 39.00;
	String nome = "Pizza 4 queijos";
	
	@Override
	public void calcularPreco() {
		System.out.println("Nome do prato: "+nome);
		System.out.println("Valor do prato: "+preco);
	}
}
