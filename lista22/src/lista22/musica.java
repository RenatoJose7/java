package lista22;

public class musica {
	
	String titulo;
	String artista;
	int duracao;
	
	void tocar(){
		System.out.println("Tocando "+ titulo+" do artista "+ artista);
	}
	void pausar() {
		System.out.println("Música pausada");
	}
	void mostrarDetalhes() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Artista: "+artista);
		System.out.println("Duração: "+ duracao + " minutos");
	}
	
}
