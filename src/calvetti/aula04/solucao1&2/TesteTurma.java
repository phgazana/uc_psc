import javax.swing.JOptionPane;

public class TesteTurma{
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String curso = JOptionPane.showInputDialog("Digite o curso:");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie:"));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        JOptionPane.showMessageDialog(null, turma.getDados());

        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);

        JOptionPane.showMessageDialog(null, turma.getDados());
    }
}