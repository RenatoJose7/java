package lista23;

public class carro {

    private String modelo;
    private int ano;
    private int velocidadeAtual = 0; // começa em 0

  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }


    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            System.out.println("Acelerou +" + valor + " km/h");
        } else {
            System.out.println("Valor inválido para acelerar");
        }
    }


    public void frear(int valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freou -" + valor + " km/h");
        } else {
            System.out.println("Valor inválido para frear");
        }
    }
}
