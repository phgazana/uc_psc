import javax.swing.*;

public class Solucao6 {
    public static void main(String[] args) {

        /*6) Ler vários números até entrar o número -999. Para cada número, imprimir sua raiz
quadrada e seu inverso.*/

        double numero;

        do {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Sair -999 | Insira o número:"));

            if (numero != -999) {
                JOptionPane.showMessageDialog(null, Math.sqrt(numero));
            }
        } while (numero != -999);
    }
}
