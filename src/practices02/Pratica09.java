import javax.swing.JOptionPane;

public class Pratica02_9 {
    public static void main(String[] args) {

        double n1;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));

        if (n1 >= 0) {
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(n1));
        } else {
            JOptionPane.showMessageDialog(null, "Ao quadrado: " + Math.pow(n1, 2));
        }
    }
}
