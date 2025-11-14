package ex6;

public class Violao extends Instrumento{
	@Override
	public void tocar(){
		System.out.println("Tocando: Um Amor Puro do Djavan! No violão");
		System.out.println();
		System.out.println("F7M                             E4  E\r\n"
				+ "    O que há dentro do meu coração\r\n"
				+ "Dm7                           C  C7M/E  \r\n"
				+ "    Eu tenho guardado pra te dar");
	}
}
