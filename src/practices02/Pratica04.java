import javax.swing.JOptionPane;

public class Pratica02_4 {

    public static void main(String[] args) {

        String nome;
        char letra;

        nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

        letra = nome.toUpperCase().charAt(0);

        if (letra >= 'A' && letra <= 'K') {
            JOptionPane.showMessageDialog(null, "Alunos cujo nome começa com as letras de A a K estão na D1.");
        } else if (letra >= 'L' && letra <= 'N') {
            JOptionPane.showMessageDialog(null, "Alunos cujo nome começa com as letras de L a N estão na D2.");
        } else if (letra >= 'O' && letra <= 'Z') {
            JOptionPane.showMessageDialog(null, "Alunos cujo nome começa com as letras de O a Z estão na D3.");
        } else {
            JOptionPane.showMessageDialog(null, "Digite um nome válido.");
        }
    }
}
