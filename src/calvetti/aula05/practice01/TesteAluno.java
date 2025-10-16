import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
        char sexo = JOptionPane.showInputDialog("Sexo M/F:").charAt(0);
        sexo = Character.toUpperCase(sexo);
        String codigo = JOptionPane.showInputDialog("Código da turma:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da turma:"));

        Turma turma = new Turma(codigo, ano);
        Aluno aluno = new Aluno(nome, idade, peso, sexo, turma);

        JOptionPane.showMessageDialog(null, aluno.getDados());

        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
        boolean formando = Boolean.parseBoolean(JOptionPane.showInputDialog("É formando: true/false"));

        aluno.setIdade(idade);
        aluno.setPeso(peso);
        aluno.setFormando(formando);

        JOptionPane.showMessageDialog(null, aluno.getDados());
    }
}
