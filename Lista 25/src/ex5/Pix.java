package ex5;

public class Pix extends Pagamento{
	
	@Override
	public void processarPagamento() {
		System.out.println("Pix realizado com sucesso");
		System.out.println("Pagamento concluido!");
	}
}
