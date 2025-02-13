public class App {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

        meuCarro.acelerar(50);
        System.out.println("Velocidade Atual: " + meuCarro.getVelocidadeAtual() + " km/h");

        meuCarro.frear(30);
        System.out.println("Velocidade Atual após frear: " + meuCarro.getVelocidadeAtual() + " km/h");
    }
}
