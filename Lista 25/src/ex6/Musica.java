package ex6;

public class Musica {

	public static void main(String[] args) {
		Instrumento v = new Violao();
		Instrumento p = new Piano();
		Instrumento b = new Bateria();

		v.tocar();
		System.out.println("---------------------------------------------");
		p.tocar();
		System.out.println("---------------------------------------------");
		b.tocar();
	}

}
