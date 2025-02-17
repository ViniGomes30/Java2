public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); 
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

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
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! O ano deve ser 1886 ou superior.");
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
        } else {
            System.out.println("O incremento deve ser positivo.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
            } else {
                velocidadeAtual = 0;
                System.out.println("O carro parou completamente.");
            }
        } else {
            System.out.println("O decremento deve ser positivo.");
        }
    }
}