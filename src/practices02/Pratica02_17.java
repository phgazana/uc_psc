import javax.swing.JOptionPane;

public class Pratica02_17 {
    public static void main(String[] args) {

        double n1;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (n1 % 3 == 0 || n1 % 7 == 0) {
            JOptionPane.showMessageDialog(null, "É divisível por 3 e 7");
        } else {
            JOptionPane.showMessageDialog(null, "Não divisível por 3 e 7");
        }
    }
}
