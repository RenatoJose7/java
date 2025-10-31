package lista23;

public class avaliacao {

	private String nome;
	private int nota1;
	private int nota2;
	

	
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		if(nota2 >= 0 && nota2 <= 10) {
			this.nota2 = nota2;
			} else {
				System.out.println("Nota 2 inválida");
			}
	}
	
	
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		if(nota1 >= 0 && nota1 <= 10) {
		this.nota1 = nota1;
		} else {
			System.out.println("Nota 1 inválida");
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
