import javax.swing.JOptionPane;

public class Pratica02_1 {
    public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado:"));

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            JOptionPane.showMessageDialog(null, "Os valores PODEM formar um triângulo.");
        } else {
            JOptionPane.showMessageDialog(null, "Os valores NÃO podem formar um triângulo.");
        }
    }
}
