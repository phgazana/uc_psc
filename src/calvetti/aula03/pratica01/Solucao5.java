import javax.swing.*;

public class Solucao5 {
    public static void main(String[] args) {

        /*5) Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome
digitado.*/

        String soma = "";
        int i = 0;
        do {

            String entrada = JOptionPane.showInputDialog("FIM | Insira o nome:").toUpperCase();

            if (!entrada.equals("FIM")) {
                soma += entrada + "\n";
            } else {
                break;
            }
            i++;
        } while (true);

        if (i > 0) {
            JOptionPane.showMessageDialog(null, soma);
        }

    }
}
