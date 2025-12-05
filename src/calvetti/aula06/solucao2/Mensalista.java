public class Mensalista extends Empregado {
    private double salario;

    public Mensalista(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public Mensalista(String nome, String sobrenome, String cpf, String nome1, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    @Override
    public double salario() {
        return this.salario;
    }
}
