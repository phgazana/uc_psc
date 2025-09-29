import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome:");
        String curso = JOptionPane.showInputDialog("Curso:");
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie:"));

        for (int i = 0; i <= 1; i++) {
            int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Alunos:"));

            Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

            String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();

            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
