import javax.swing.JOptionPane;

public class Pratica02_21 {
    public static void main(String[] args) {

        int anoNascimento, idade;

        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento:"));
        idade = 2025 - anoNascimento;


        if (idade <= 0) {
            JOptionPane.showMessageDialog(null, "Ano inválido");
        } else {
            JOptionPane.showMessageDialog(null, "Idade: " + idade);
        }
    }
}
