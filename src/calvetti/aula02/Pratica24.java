import javax.swing.JOptionPane;

public class Pratica02_24 {
    public static void main(String[] args) {

        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        JOptionPane.showMessageDialog(null, "Menor:" + Math.min(n1, n2) + "\nMaior:" + Math.max(n1, n2));
    }
}
