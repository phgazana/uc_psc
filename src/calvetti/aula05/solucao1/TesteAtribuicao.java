import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {

        Professor professor = new Professor ("Paulo", 18);
        Disciplina disciplina = new Disciplina("Matematica", true);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());

    }
}
