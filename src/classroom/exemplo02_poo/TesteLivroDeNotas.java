import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {

        LivroDeNotas livroDeNotas = new LivroDeNotas();
        String nomeDoCurso = JOptionPane.showInputDialog("Digite o nome do curso:");
        livroDeNotas.setNomeDoCurso(nomeDoCurso);
        livroDeNotas.exibirMensagem();
    }
}
