import javax.swing.JOptionPane;

public class Solucao13 {
    public static void main(String[] args) {

        /*13) Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das
dezenas é par ou ímpar.*/

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int dezena = (numero / 10) % 10;

        if (numero >= 100 && numero <= 999 && dezena % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é par");
        } else {
            if (numero >= 100 && numero <= 999 && dezena % 2 != 0) {
                JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é impar");
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido");
            }
        }
    }
}
