import javax.swing.JOptionPane;

public class Pratica02_23 {
    public static void main(String[] args) {

        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        JOptionPane.showMessageDialog(null, "Menor número: " + Math.min(n1, n2));
    }
}
