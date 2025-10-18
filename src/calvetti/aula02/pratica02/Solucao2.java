import javax.swing.JOptionPane;

public class Solucao2 {
    public static void main(String[] args) {

        /*2) Construir um algoritmo que leia dois números e efetue a adição. Caso o valor
somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.*/

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        int adicao = valor1 + valor2;

        if (adicao <= 20) {
            JOptionPane.showMessageDialog(null, adicao - 5);
        }
    }
}
