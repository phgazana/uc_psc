import javax.swing.JOptionPane;

public class Pratica01_14 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        double log = Math.log10(num);

        JOptionPane.showMessageDialog(null, "Logaritmo na base dez: " + Math.floor(log));
    }
}
