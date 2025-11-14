package Ex3;

public class ContaPoupanca extends Conta{
	double poupanca = 1.05;
	double rpoupanca = valorInicial * poupanca;
	@Override
	
	public void calcularRendimento() {
		System.out.println("\n\n\n----- Poupança -----");
		System.out.println("Valor Inicial: "+valorInicial);
		System.out.println("Rendimento: "+rpoupanca);
	}
	

}
