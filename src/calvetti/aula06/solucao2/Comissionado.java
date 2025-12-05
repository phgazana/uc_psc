public class Comissionado extends Mensalista{
    private double comissao;

    public Comissionado(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public Comissionado(String nome, String sobrenome, String cpf, String nome1, double salario, double comissao) {
        super(nome, sobrenome, cpf, nome1, salario);
        this.comissao = comissao;
    }

    @Override
    public double salario(){
        return super.salario() + comissao;
    }
}
