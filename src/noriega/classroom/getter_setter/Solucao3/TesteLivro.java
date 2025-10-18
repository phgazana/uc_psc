public class TesteLivro {
    public static void main(String[] args) {

        Livro l1 = new Livro("Jogos Vorazes", "Suzanne Collins", 2008, 26.0);
        l1.setAutor("Carlos Noriega");
        l1.getMostrarDados();

        Livro l2 = new Livro("Diário de um Banana", "Jeff Kinney", 2007, 43.15);
        l2.setPreco(-9);

        Livro l3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 18.90);
        l3.getMostrarDados();
    }
}
