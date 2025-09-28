import javax.swing.JOptionPane;

public class Pratica01_9 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para ser elevado ao quadrado:"));

        JOptionPane.showMessageDialog(null, "O numero ao quadrado e: " + Math.pow(num, 2));
    }
}
