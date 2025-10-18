import javax.swing.JOptionPane;

public class Solucao4 {
    public static void main(String[] args) {
        /*4) Ajude uma escola a montar as divisões do laboratório de programação. Para isso,
escreva um algoritmo que leia o nome do aluno e diga em qual divisão ele está
respeitando a regra abaixo:
- Alunos cujo nome começa com as letras de A a K estão na D1;
- Alunos cujo nome começa com as letras de L a N estão na D2;
- Alunos cujo nome começa com as letras de O a Z estão na D3.
Dica: use o método charAt(posição)*/

        char cadastrar;
        char nomeAluno;

        do {
            cadastrar = JOptionPane.showInputDialog("0. Sair | 1. Cadastrar Aluno").charAt(0);

            if (cadastrar == '1') {
                nomeAluno = JOptionPane.showInputDialog("Insira o nome do aluno:").toUpperCase().charAt(0);
            } else {
                break;
            }

            if (nomeAluno >= 'A' && nomeAluno <= 'K') {
                JOptionPane.showMessageDialog(null, "Alunos cujo nome começa com as letras de A a K estão na D1");
            } else {
                if (nomeAluno >= 'L' && nomeAluno <= 'N') {
                    JOptionPane.showMessageDialog(null, "Alunos cujo nome começa com as letras de L a N estão na D2");
                } else {
                    if (nomeAluno >= 'O' && nomeAluno <= 'Z') {
                        JOptionPane.showMessageDialog(null, "Alunos cujo nome começa com as letras de O a Z estão na D3");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caracter inválido");
                    }
                }
            }
        } while (cadastrar != '0');

    }

}
