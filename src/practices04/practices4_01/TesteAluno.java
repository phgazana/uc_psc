import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
        char sexo = JOptionPane.showInputDialog("Sexo M/F:").charAt(0);
        sexo = Character.toUpperCase(sexo);

        Aluno aluno = new Aluno(nome, idade, peso, sexo);

        String msg = "Nome " + aluno.getNome() + "\nIdade " + aluno.getIdade() + " anos" + "\nPeso " + aluno.getPeso() + "kg";
        if (aluno.getFormando()) {
            msg += "\nFormando: Sim";
        } else {
            msg += "\nFormando: Nao";
        }
        if (aluno.getSexo() == 'M') {
            msg += "\nSexo: Masculino";
        } else {
            msg += "\nSexo: Feminino";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}