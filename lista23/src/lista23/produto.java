package lista23;

public class produto {

	private String nome;
	private double preco;
	private int estoque;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if(estoque >= 0) {
			this.estoque = estoque;
		} else {
			System.out.println("Estoque inválido");
		}
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido.");
		}
	}
	
}
