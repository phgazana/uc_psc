import javax.swing.JOptionPane;

public class Pratica03_10 {
    public static void main(String[] args) {

        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

            if (num != -999) {
                JOptionPane.showMessageDialog(null, "Número: " + num + "\nDivisor: ");
            }

        } while (num != -999);


    }
}
