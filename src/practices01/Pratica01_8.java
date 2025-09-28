import javax.swing.JOptionPane;

public class    Pratica01_8 {
    public static void main(String[] args) {

        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retangulo:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triangulo:"));

        int area = base * altura;

        JOptionPane.showMessageDialog(null, "A area do retangulo com base nas medidas: " + area);
    }
}
