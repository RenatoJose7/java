package ex5;

public class CartaoCredito extends Pagamento{
	
	@Override
	public void processarPagamento() {
		System.out.println("Cartão de crédito aceito com sucesso");
		System.out.println("Pagamento concluido!");
	}
}
