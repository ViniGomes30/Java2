public class Pessoa {
    private String nome;
    private int idade;
    private Carro carro;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void comprarCarro(Carro carro) {
        this.carro = carro;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (carro != null) {
            System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + " (" + carro.getAno() + ")");
        } else {
            System.out.println("Carro: Nenhum carro comprado.");
        }
    }
}