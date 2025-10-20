public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 30);

        p1.mostrarDados();
        p1.setNome("Beatriz");
        p1.setIdade(35);
        p1.mostrarDados();
        p1.setIdade(-5);
        p1.mostrarDados();
    }
}
