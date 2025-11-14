package Ex3;

public class ContaInvestimento extends Conta{
	double poupanca = 1.10;
	double rpoupanca = valorInicial * poupanca;
	
	@Override
	
	public void calcularRendimento() {
		System.out.println("\n\n\n----- Investimento -----");
		System.out.println("Valor Inicial: "+valorInicial);
		System.out.println("Rendimento: "+rpoupanca);
	}
	
}
