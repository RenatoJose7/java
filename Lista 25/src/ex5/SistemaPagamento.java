package ex5;

public class SistemaPagamento {

	public static void main(String[] args) {
		Pagamento pix = new Pix();
		Pagamento CC = new CartaoCredito();
		Pagamento dinheiro = new dinheiro();
		
		System.out.println();
		pix.processarPagamento();
		System.out.println();
		CC.processarPagamento();
		System.out.println();
		dinheiro.processarPagamento();

	}

}
