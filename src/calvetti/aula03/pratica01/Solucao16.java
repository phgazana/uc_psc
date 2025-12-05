import javax.swing.JOptionPane;

public class Solucao16 {
    public static void main(String[] args) {

        int n1 = 1, n2 = 1, n3;
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        while (n1 <= num) {
            JOptionPane.showMessageDialog(null, n1);

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }

    }
}
