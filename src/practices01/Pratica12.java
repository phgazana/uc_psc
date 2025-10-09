
import javax.swing.JOptionPane;

public class Pratica01_12 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        int dezena = (num / 10) % 10;

        JOptionPane.showMessageDialog(null, "Algarismo da casa das dezena: " + dezena);
    }
}


