import javax.swing.JOptionPane;

public class Pratica03_6 {
    public static void main(String[] args) {

        double num;

        do {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

            if (num != -999) {

                JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(num) + "\nInverso: " + 1.0 / num);
            }
        } while (num != -999);
    }
}