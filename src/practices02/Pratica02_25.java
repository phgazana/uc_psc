import javax.swing.JOptionPane;

public class Pratica02_25 {
    public static void main(String[] args) {

        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        JOptionPane.showMessageDialog(null, "Maior:" + Math.max(n1, n2) + "\nMenor:" + Math.min(n1, n2));
    }
}
