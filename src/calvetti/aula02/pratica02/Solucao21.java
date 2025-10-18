import javax.swing.JOptionPane;

public class Solucao21 {
    public static void main(String[] args) {

        /*21) Ler três números e escrever o maior número (suponha números diferentes).*/

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, num1);
        } else {
            if (num2 > num1 && num2 > num3) {
                JOptionPane.showMessageDialog(null, num2);
            } else {
                if (num3 > num1 && num3 > num2) {
                    JOptionPane.showMessageDialog(null, num3);
                }
            }
        }
    }
}
