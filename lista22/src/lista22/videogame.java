package lista22;

public class videogame {

	String modelo;
	String marca;
	boolean ligado;
	
	 void ligar(){
		ligado = true;
			System.out.println("O videogame está ligado");
		}
	 void desligar() {
		 ligado = false;
		 	System.out.println("O videogame está desligado");
	 }
	 void verificarStatus(){
		 if(ligado = true) {
			 System.out.println("O videogame está ligado");
		 } else {
			 System.out.println("O videogame está desligado");
		 }
	 }
	 
}
