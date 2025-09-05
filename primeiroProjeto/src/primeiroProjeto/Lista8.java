package primeiroProjeto;

import java.util.Scanner;

public class Lista8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Classificação de Dia da Semana
		
		System.out.println("Informe um número de 1 a 7 e veja a classe do dia ");
		int numero = scanner.nextInt();
		switch(numero) {
		case 1:
			System.out.println("Fim de semana");
			break;
		
		case 2:
			System.out.println("Dia útil");
			break;
			
		case 3:
			System.out.println("Dia útil");
			break;
			
		case 4:
			System.out.println("Dia útil");
			break;
			
		case 5:
			System.out.println("Dia útil");
			break;
			
		case 6:
			System.out.println("Dia útil");
			break;
			
		case 7:
			System.out.println("Fim de semana");
			break;
			
		default:
			System.out.println("Dia inválido");
		
		}
		
		//2 - Menu de Bebidas
		System.out.println("Informe a bebida que deseja");
		System.out.println("1= Café");
		System.out.println("2= Chá");
		System.out.println("3= Suco");
		System.out.println("4= Refrigerante");
		int preco = scanner.nextInt();
		switch(preco) {
		case 1:
			System.out.println("Café= R$ 4,50");
			break;	
		case 2:
			System.out.println("Chá= R$ 3,50");
			break;
		case 3:
			System.out.println("Suco = R$ 4,00");
			break;
		case 4: 
			System.out.println("Refrigerante = R$ 4,50");
			break;
		default:
			System.out.println("Código invalido");
		}
		
		// 3 - Tipo de Veículo
		System.out.println("Informe o código do veículo ");
		System.out.println("1= Carro");
		System.out.println("2= Moto");
		System.out.println("3= Caminhão");
		int veiculo = scanner.nextInt();
		switch(veiculo) {
		case 1:
			System.out.println("Veículo leve");
			break;
		
		case 2:
			System.out.println("Motocicleta");
			break;
			
		case 3:
			System.out.println("Pesado");
			break;
			
		default:
			System.out.println("Veículo inválido");
		
		}
		
		//4 - Escolha de Plano de Assinatura
		
		System.out.println("Informe o código do plano");
		System.out.println("1= Básico");
		System.out.println("2= Intermediário");
		System.out.println("3= Premium");
		int plano = scanner.nextInt();
		switch(plano) {
		case 1:
			System.out.println("Acesso limitado");
			break;
		case 2:
			System.out.println("Acesso padrão + suporte");
			break;
		case 3:
			System.out.println("Acesso total + suporte prioritário");
			break;
		default:
			System.out.println("Plano inválido");
		}
		
		// 5 - Seleção de Mês
		System.out.println("Informe um número de 1 a 12 representando um mês");
		int estacao = scanner.nextInt();
		switch(estacao) {
		case 12,1,2:
			System.out.println("Verão");
			break;
		case 3,4,5:
			System.out.println("Outono");
			break;
		case 6,7,8:
			System.out.println("Inverno");
			break;
		case 9,10,11:
			System.out.println("Primavera");
		break;
		default:
			System.out.println("Mês invalido");
		}
		
		// 6 - Tipo de Ingresso
		System.out.println("Informe o código do ingresso");
		System.out.println("1= Inteira");
		System.out.println("2= Meia-entrada");
		System.out.println("3= VIP");
		int ingresso = scanner.nextInt();
		switch(ingresso) {
		case 1:
			System.out.println("Inteira = R$ 50,00");
			break;
		case 2:
			System.out.println("Meia-entrada = R$25,00 ");
			break;
		case 3:
			System.out.println("VIP = R$ 100,00");
			break;
		default:
			System.out.println("Ingresso inválido");
		}
		
		// 7 - Escolha de Idioma
		System.out.println("Informe o código do idioma");
		System.out.println("1= Português");
		System.out.println("2= Inglês");
		System.out.println("3= Espanhol");
		int idioma = scanner.nextInt();
		switch(idioma) {
		case 1:
			System.out.println("Olá!");
			break;
		case 2:
			System.out.println("Hello!");
			break;
		case 3:
			System.out.println("Hola!");
			break;
		default:
			System.out.println("Idioma inválido");
		}
		
		// 8 - Nível de Acesso
		System.out.println("Informe o nível");
		System.out.println("1= Usuário");
		System.out.println("2= Moderador");
		System.out.println("3= Administrador");
		int acesso=scanner.nextInt();
		switch(acesso) {
		case 1:
			System.out.println("Acesso básico");
			break;
		case 2:
			System.out.println("Acesso básico + edição");
			break;
		case 3:
			System.out.println("Acesso total");
			break;
		default:
			System.out.println("Nível inválido");
		}
		
		//9 - Tipo de Pagamento
		System.out.println("Informe o código de pagamento");
		System.out.println("1= Dinheiro");
		System.out.println("2= Cartão de Crédito");
		System.out.println("3= Pix");
		int pagamento =scanner.nextInt();
		switch(pagamento) {
		case 1:
			System.out.println("Pagamento em dinheiro confirmado");
			break;
		case 2:
			System.out.println("Pagamento com cartão processado");
			break;
		case 3:
			System.out.println("Pagamento via Pix realizado");
			break;
		default:
			System.out.println("Método inválido");
		}
		
		
		
	}

}
