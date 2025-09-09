import javax.swing.JOptionPane;

public class Pratica01_10 {
    public static void main(String[] args) {

        String c1, c2, c3;
        double c1_1, c2_1, c3_1, soma;

        c1 = JOptionPane.showInputDialog("Digite o primeiro comprimento:");
        c2 = JOptionPane.showInputDialog("Digite o segundo comprimento:");
        c3 = JOptionPane.showInputDialog("Digite o terceiro comprimento:");

        c1_1 = Double.parseDouble(c1);
        c2_1 = Double.parseDouble(c2);
        c3_1 = Double.parseDouble(c3);
        soma = c1_1 + c2_1 + c3_1;

        JOptionPane.showMessageDialog(null, "A soma dos três comprimentos é: " + soma);

    }
}