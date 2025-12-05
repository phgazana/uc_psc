public abstract class Empregado extends PessoaFisica {

    public Empregado(String nome) {
        super(nome, "Sobrenome", "Cpf");
    }
    public Empregado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public abstract double salario();
}
