import javax.swing.JOptionPane;

public class Pratica01_22 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        JOptionPane.showMessageDialog(null, "Numero: " + num + "\nQuadrado: " + Math.pow(num, 2) + "\nRaiz quadrada: " + Math.sqrt(num));

    }
}