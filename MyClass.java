public class MyClass {
  public static void main(String args[]) {
    int idade = 24 ;
    double salario = 1.750 ;
    char letra = 'J' ;
    boolean estudante = true ;
    String nome = "Renatinho" ;
    System.out.println("Minha idade é: " + idade) ;
    System.out.println("O salário é: " + salario) ;
    System.out.println("A letra é: " + letra) ;
    System.out.println("Você estuda? " + estudante) ;
    System.out.println("Meu nome é: " + nome) ; 

    
    //Operadores aritméticos
    
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + sub);
    System.out.println("Multiplicação: " + mult);
    System.out.println("Divisão: " + div);
    
    //*Calculo de área de um retângulo
    //largura * comprimento
    
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    System.out.println("A área é: " + area);
    
    // Calculo de desconto
    
    double valor = 100;
    double desconto = 15; //desconto
    double ValorDesc = valor * (desconto / 100);
    double ValorFinal = valor - ValorDesc;
    System.out.println("A pagar é: " + ValorFinal);
  }
}