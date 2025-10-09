import javax.swing.JOptionPane;

public class Pratica02_2 {
    public static void main(String[] args) {

        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));


        if (n1 + n2 < n3 || n2 + n3 < n1 || n1 + n3 < n2) {
            JOptionPane.showMessageDialog(null, "Não podem ser lados de um triângulo");
        } else if (n1 == n2 && n2 == n3) {
            JOptionPane.showMessageDialog(null, "O triângulo é equilátero");
        } else if (n1 == n2 || n2 == n3 || n3 == n1) {
            JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
        } else if (n1 != n2 && n2 != n3 && n3 != n1) {
            JOptionPane.showMessageDialog(null, "O triângulo é escaleno");
        }
    }
}