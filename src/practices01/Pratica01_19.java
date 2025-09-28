import javax.swing.JOptionPane;

public class Pratica01_19 {

    public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero:"));

        double x = 2 * ((a - c) / 8) - b * 5;

        JOptionPane.showMessageDialog(null, "Resultado da expressao: " + x);
    }
}
