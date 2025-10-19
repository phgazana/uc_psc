import javax.swing.*;

public class Solucao3 {
    public static void main(String[] args) {

        /*3) Entrar com vários números positivos e imprimir a média dos números digitados.*/
        int i = 0;
        int soma = 0;

        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("0. Sair | Inserir Número:"));

            if (numero != 0) {
                soma += numero;
            } else {
                break;
            }
            i++;
        } while (true);

        if (i > 0) {
            JOptionPane.showMessageDialog(null, soma / i);
        }
    }
}
