import javax.swing.JOptionPane;

public class Pratica02_18 {
    public static void main(String[] args) {

        double n1;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (n1 % 10 == 0 || n1 % 5 == 0 || n1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "É divisível por 10, 5 e 2");
        } else {
            JOptionPane.showMessageDialog(null, "Não divisível por 10, 5 e 2");
        }
    }
}
