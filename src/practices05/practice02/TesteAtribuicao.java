import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {

        String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor:"));
        String nomeDisciplina = JOptionPane.showInputDialog("Digite a disciplina:");
        boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("Pratica True/False:"));

        Professor professor = new Professor (nomeProfessor, idade);
        Disciplina disciplina = new Disciplina(nomeDisciplina, pratica);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());

    }
}
