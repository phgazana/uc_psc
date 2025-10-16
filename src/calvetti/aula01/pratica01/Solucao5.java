import javax.swing.JOptionPane;

public class Solucao5 {
    public static void main(String[] args) {

        /*5) Ler dez caracteres e imprimir a palavra formada por eles;*/

        String palavra = "";

        for (int i = 1; i <= 10; i++) {

            char caracteres = JOptionPane.showInputDialog("Digite um caracter:").charAt(0);

            palavra += caracteres;

        }

        JOptionPane.showMessageDialog(null, palavra);

    }
}
