import javax.swing.JOptionPane;

public class Solucao1 {
    public static void main(String[] args) {

        /*1) Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
caso o resultado seja maior que 10, apresentá-lo.*/

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        int adicao = valor1 + valor2;

        if (adicao > 10) {
            JOptionPane.showMessageDialog(null, adicao);
        }
    }
}
