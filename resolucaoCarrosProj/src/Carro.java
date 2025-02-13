public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidadeAtual;

    Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }


    public void acelerar(double velocidade) {
        this.velocidadeAtual += velocidade;
    }

    public void frear(double velocidade) {
        this.velocidadeAtual -= velocidade;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    



}
