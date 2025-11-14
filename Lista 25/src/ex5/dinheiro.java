package ex5;

public class dinheiro extends Pagamento{
	
	@Override
	public void processarPagamento() {
		System.out.println("Dinheiro certo, sem troco.");
		System.out.println("Pagamento concluido!");
	}
}

