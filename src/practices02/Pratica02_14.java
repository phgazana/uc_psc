import javax.swing.JOptionPane;

public class Pratica02_14 {
    public static void main(String[] args) {

        double n1, n2;
        double maior;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }

        JOptionPane.showMessageDialog(null, "Maior: " + maior);

    }
}
