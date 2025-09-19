import javax.swing.JOptionPane;

public class Pratica02_12 {
    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (n1 > 20) {
            JOptionPane.showMessageDialog(null, "Maior do que 20");
        } else if (n1 < 20) {
            JOptionPane.showMessageDialog(null, "Menor do que 20");
        } else {
            JOptionPane.showMessageDialog(null, "Numero igual a 20");
        }
    }
}