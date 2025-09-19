import javax.swing.JOptionPane;

public class Praticas02_22 {
    public static void main(String[] args) {

        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Números iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Números diferentes");
        }
    }
}
