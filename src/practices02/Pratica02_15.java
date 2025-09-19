import javax.swing.JOptionPane;

public class Pratica02_15 {
    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (n1 % 3 == 0) {
            JOptionPane.showMessageDialog(null, "É multiplo de 3");
        } else {
            JOptionPane.showMessageDialog(null, "Não é multiplo de 3");
        }
    }
}
