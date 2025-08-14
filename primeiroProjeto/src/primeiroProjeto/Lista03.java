package primeiroProjeto;

import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		// Resultado de dois números
		System.out.println();
		System.out.println("Resultado de dois números");
		System.out.println("Informe um número: ");
		int nm1;
		nm1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		int nm2;
		nm2 = scanner.nextInt();
		double result = nm1 + nm2;
		System.out.println("O resultado é: "+ result);
		
		// Divisão e resto
		
		System.out.println();
		System.out.println("Divisão e resto");
		System.out.println("Informe um número: ");
		int num1;
		num1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		int num2;
		num2 = scanner.nextInt();
		double div1 = num1 / num2;
		double resto =  num1 % num2;
		System.out.println("O resultado da divisão é: "+ div1);
		System.out.println("Já o resto é: "+ resto);
		
		// Perímetro de um triângulo
		
		System.out.println();
		System.out.println("Perímetro de um triângulo");
		System.out.println("Perímetro do triângulo");
		System.out.println("Informe um dos lados: ");
		double lado1, lado2, lado3;
		lado1 = scanner.nextDouble();
		System.out.println("Informe outro lado: ");
		lado2 = scanner.nextDouble();
		System.out.println("Informe o ultimo lado: ");
		lado3 = scanner.nextDouble();
		double perimetro = lado1 + lado2 + lado3;
		System.out.println("O perímetro é: " + perimetro);
		
		
		// Calculadora de Gorjeta
		
		System.out.println();
		System.out.println("Calculadora de Gorjeta");
		System.out.println("Informe o valor da conta do restaurante: ");
		double conta, PorGorjeta;
		conta =  scanner.nextDouble();
		System.out.println("Informe qual a porcentagem de gorjeta você deseja dar: ");
		PorGorjeta = scanner.nextDouble();
		double gorjeta = conta * (PorGorjeta/100);
		double total = conta + gorjeta;
		System.out.println("O valor total pago é: "+ total);
		
		// Calculadora de área de círculo
		
		System.out.println();
		System.out.println("Calculadora de área de círculo");
		System.out.println("Informe o raio de um circulo (em metros)");
		double raio;
		raio = scanner.nextDouble();
		double pi = 3.14159;
		double areaCirculo = pi * raio * raio;
		System.out.println("A área do circulo é de: "+ areaCirculo);
		
		// Conversor de idade em dias
		
		System.out.println();
		System.out.println("Conversor de idade em dias");
		System.out.println("Informe sua idade em anos, meses e dias: ");
		double anos, meses, dias;
		System.out.println("Anos: ");
		anos = scanner.nextDouble();
		System.out.println("Meses: ");
		meses = scanner.nextDouble();
		System.out.println("Dias: ");
		dias = scanner.nextDouble();
		double totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Você ja viveu: " + totalDias + " Dias!");
		
		// Calculadora de pagamentos por hora
		
		System.out.println();
		System.out.println("Calculadora de pagamentos por hora");
		System.out.println("Informe o número de horas trabalhadas: ");
		double hora, pagamento;
		hora =  scanner.nextDouble();
		System.out.println("Agora, informe qual valor pago por hora: ");
		pagamento = scanner.nextDouble();
		double salario = hora * pagamento;
		double imposto = salario * 0.10;
		double salarioLiquido = salario - imposto;
		System.out.println("Seu salário bruto é: " + salario);
		System.out.println("Seu salário com impostos é: "+ salarioLiquido);
	}

}
