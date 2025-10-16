import javax.swing.JOptionPane;

public class Pratica02_16 {
    public static void main(String[] args) {

        double n1;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (n1 % 5 == 0) {
            JOptionPane.showMessageDialog(null, "É divisível por 5");
        } else {
            JOptionPane.showMessageDialog(null, "Não é divisível por 5");
        }
    }
}
