enum Combustivel {
    GASOLINA,
    ALCOOL,
    DIESEL,
    ELETRICO
}

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Combustivel tipoCombustivel;

    public Carro(String marca, String modelo, int ano, Combustivel tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
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
        this.ano = ano;
    }

    public Combustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(Combustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}