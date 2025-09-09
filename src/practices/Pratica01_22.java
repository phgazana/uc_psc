import javax.swing.JOptionPane;

public class Pratica01_22 {
    public static void main(String[] args) {

        double numero, quadrado, raiz;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        quadrado = Math.pow(numero, 2);
        raiz = Math.sqrt(numero);

        JOptionPane.showMessageDialog(null, "Número: " + numero + "\n" + "Quadrado: " + quadrado + "\n" + "Raiz:" + raiz);

    }
}