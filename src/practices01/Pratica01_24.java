import javax.swing.JOptionPane;

public class Pratica01_24 {
    public static void main(String[] args) {

        double area, diagonalMaior, diagonalMenor;

        diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal maior:"));
        diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal menor:"));

        area = (diagonalMaior * diagonalMenor) / 2;

        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}