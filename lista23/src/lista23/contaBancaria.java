package lista23;

public class contaBancaria {

	private String titular;
	private double saldo;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo >= 0) {
		this.saldo = saldo;
		} else {
			System.out.println("Saldo inválido");
		}
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("Saldo depositado com sucesso");
		} else {
			System.out.println("Valor inválido");
		}
	}
	public void sacar(double valor) {
		if (valor >= 0 && valor <= saldo) {
			saldo = valor - saldo;
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saque inválido");
		}
	}
}
