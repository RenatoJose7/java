package lista22;

public class produto {

	String nome;
	int preco;
	int estoque;
	
	void mostrarInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println("Preço: "+preco);
		System.out.println("Estoque: "+estoque);
	}
		void vender(int quantidade) {
			if (estoque > 1) {
			int venda = estoque - quantidade;
			System.out.println("Novo estoque: "+venda);
			} else {
				System.out.println("Não possuí estoque disponível");
			}
		}
	}

