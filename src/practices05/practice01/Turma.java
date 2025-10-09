public class Turma {

    private String codigo;
    private int ano;

    public Turma(String c, int a) {

        this.codigo = c;
        this.ano = a;

    }

    public String getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setCodigo(String c) {
        this.codigo = c;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public String getDados() {
        return "Turma [código=" + codigo + ",ano=" + ano + "]";
    }
}
