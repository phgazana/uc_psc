import javax.swing.JOptionPane;

public class Pratica02_27 {
    public static void main(String[] args) {

        int n1, n2, n3;
        int maior;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        JOptionPane.showMessageDialog(null, "Maior: " + maior);
    }
}
