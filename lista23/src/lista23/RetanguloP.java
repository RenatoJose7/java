package lista23;

import java.util.Scanner;

public class RetanguloP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

     
        r.setLargura(5);
        r.setAltura(3);

        System.out.println("Retângulo 1:");
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        System.out.println("----------------------------------");

        
        System.out.print("Informe a largura: ");
        r.setLargura(sc.nextDouble());

        System.out.print("Informe a altura: ");
        r.setAltura(sc.nextDouble());

        System.out.println("Retângulo 2:");
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        sc.close();
    }
}
