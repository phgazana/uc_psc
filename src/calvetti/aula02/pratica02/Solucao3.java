import javax.swing.*;

public class Solucao3 {
    public static void main(String[] args) {

        /*3) Entrar com um número e imprimir a raiz quadrada do número caso ele seja
positivo e o quadrado do número caso seja negativo.*/

        double numero = -3.5;

        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, Math.sqrt(numero));
        } else {
            JOptionPane.showMessageDialog(null, Math.pow(numero, 2));
        }
    }
}
