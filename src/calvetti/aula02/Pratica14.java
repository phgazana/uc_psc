import javax.swing.JOptionPane;

public class Pratica02_14 {
    public static void main(String[] args) {

        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        JOptionPane.showMessageDialog(null, "Número maior: " + Math.max(n1, n2));

    }
}
