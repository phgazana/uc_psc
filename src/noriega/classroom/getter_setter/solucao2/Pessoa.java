public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.print("\nIdade inválida: não pode ser negativa.");
        }
    }

    public void mostrarDados() {
        System.out.print("\nNome: " + nome + "\nIdade: " + idade);
    }
}
