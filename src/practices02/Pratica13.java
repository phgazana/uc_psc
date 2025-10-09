import javax.swing.JOptionPane;

public class Pratica02_13 {
    public static void main(String[] args) {

        int idade;
        char s2;
        String nome, s1;

        nome = JOptionPane.showInputDialog("Digite o nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        s1 = JOptionPane.showInputDialog("Digite o sexo F/M:");
        s2 = s1.charAt(0);
        s2 = Character.toUpperCase(s2);

        if (idade < 25 && s2 == 'F') {
            JOptionPane.showMessageDialog(null, nome + ": " + "ACEITA");
        } else {
            JOptionPane.showMessageDialog(null, nome + ": " + "NÃO ACEITA");
        }
    }
}
