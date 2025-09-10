import javax.swing.JOptionPane;

public class Pratica01_24 {
    public static void main(String[] args) {

        double area, diagonal_maior, diagonal_menor;

        diagonal_maior = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal maior:"));
        diagonal_menor = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal menor:"));

        area = (diagonal_maior * diagonal_menor) / 2;

        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}