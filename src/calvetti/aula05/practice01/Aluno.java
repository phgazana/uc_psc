public class Aluno {

    private Turma turma;
    private String nome;
    private int idade;
    private double peso;
    private boolean formando;
    private char sexo;

    public Aluno(String n, int i, double p, char s, Turma turma) {

        this.nome = n;
        this.idade = i;
        this.peso = p;
        this.sexo = s;
        this.formando = false;
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getFormando() {
        return formando;
    }

    public char getSexo() {
        return sexo;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public void setFormando(boolean f) {
        this.formando = f;
    }

    public void setSexo(char s) {
        this.sexo = s;
    }

    public String getDados() {

        return "Aluno [nome = " + nome + ",idade = " + idade + ",peso = " + peso + ",formando = " + formando + ",sexo = " + sexo + ",turma = " + turma.getDados() + "]";
    }

}

