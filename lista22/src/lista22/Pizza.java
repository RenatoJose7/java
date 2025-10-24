package lista22;

public class Pizza {
	String sabor;
	String tamanho;
	boolean bordaRecheada;
	
	void preparar(){
		System.out.println("Preparando pizza sabor "+sabor);
	}
	void assando() {
		System.out.println("Assando pizza tamanho "+tamanho);
	}
	void mostrarInformacoes() {
		System.out.println("Sabor: "+sabor);
		System.out.println("Tamanho: "+tamanho);
		System.out.println("Borda recheada: "+bordaRecheada);
	}
}
	