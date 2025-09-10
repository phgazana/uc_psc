import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
        area = base * altura;

        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}