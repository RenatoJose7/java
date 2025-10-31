package lista23;

import java.util.Scanner;

public class carroP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carro c = new carro();

   
        c.setModelo("Gol GTI");
        c.setAno(2020);

        System.out.println("Carro: " + c.getModelo() + " (" + c.getAno() + ")");
        System.out.println("Velocidade inicial: " + c.getVelocidadeAtual() + " km/h");

        c.acelerar(50);
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual() + " km/h");

        c.frear(20);
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual() + " km/h");

        System.out.println("-----------------------------------");

        System.out.print("Informe o modelo do carro: ");
        c.setModelo(sc.next());

        System.out.print("Informe o ano: ");
        c.setAno(sc.nextInt());

        System.out.println("Velocidade inicial: " + c.getVelocidadeAtual() + " km/h");

        System.out.print("Quanto deseja acelerar? ");
        c.acelerar(sc.nextInt());
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual() + " km/h");

        System.out.print("Quanto deseja frear? ");
        c.frear(sc.nextInt());
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual() + " km/h");


    }
}
