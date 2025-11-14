package Ex3;

public class Rendimento {

	public static void main(String[] args) {
		Conta p1 = new ContaPoupanca();
		Conta p2 = new ContaInvestimento();
		
		p1.calcularRendimento();
		p2.calcularRendimento();

	}

}
