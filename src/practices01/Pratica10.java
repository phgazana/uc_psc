import javax.swing.JOptionPane;

public class Pratica01_10 {
    public static void main(String[] args) {
        String s1, s2, s3;

        s1 = JOptionPane.showInputDialog("Digite algo:");
        s2 = JOptionPane.showInputDialog("Digite algo:");
        s3 = JOptionPane.showInputDialog("Digite algo:");

        int soma = s1.length() + s2.length() + s3.length();

        JOptionPane.showMessageDialog(null, "A soma do comprimento e: " + soma);
    }
}