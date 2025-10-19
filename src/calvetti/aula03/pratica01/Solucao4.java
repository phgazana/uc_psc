import javax.swing.*;

public class Solucao4 {
    public static void main(String[] args) {

        /*4) Ler vários números e informar quantos números entre 100 e 200 foram digitados.
Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.*/

        int i = 0;
        int numero = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("0. Sair | Inserir Número:"));

            if (numero >= 100 && numero <= 200) {
                i++;
            }
        } while (numero != 0);

        if (i > 0) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}


