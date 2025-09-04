import javax.swing.JOptionPane;

public class Pratica01_1 {
    public static void main(String[] args) {

        String palavra1, palavra2, palavra3;

        palavra1 = JOptionPane.showInputDialog(
                "Escreva uma palavra");
        palavra2 = JOptionPane.showInputDialog(
                "Escreva uma palavra");
        palavra3 = JOptionPane.showInputDialog(
                "Escreva uma palavra");

        JOptionPane.showMessageDialog(null, palavra3 + " " + palavra2 + " " + palavra1);
    }
}
