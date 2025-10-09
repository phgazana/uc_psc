public class Aluno {

    //Atributos (Definem as caracteristicas)
    private String nome; //private não permite "chamar" as declarações em outras classes
    private int idade;
    private double peso;
    private boolean formando;
    private char sexo;

    //Método construtor
    public Aluno(String n, int i, double p, char s) { //public segue a lógica inversa do private
        nome = n; //Intermediario
        idade = i;
        peso = p;
        sexo = s;
        formando = false;//Não foi incapsulado no parênteses neste caso porque o aluno enquanto estuda não sera formado
    }

    //Métodos (Definem o que o objeto faz)
    public String getNome() {
        return nome;
    }//get() é o método de acesso que irá retornar o atributo

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

    public void setNome(String n) {
        nome = n;
    }//set() é o método modificador que irá alterar o atributo

    public void setIdade(int i) {
        idade = i;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public void setFormando(boolean f) {
        formando = f;
    }

    public void setSexo(char s) {
        sexo = s;
    }
}