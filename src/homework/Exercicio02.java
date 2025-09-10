import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        double num1, num2, num3, num4, soma;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));

        soma = Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2) + Math.pow(num4, 2);

        JOptionPane.showMessageDialog(null, "Resultado: " + soma);
    }

}
