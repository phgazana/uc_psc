public class LivroDeNotas {

    private String nomeDoCurso;

    public void exibirMensagem() {
        System.out.printf("Bem vindo ao curso %s", getNomeDoCurso());

    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }                           //Parametro de metodo

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
}