import javax.swing.JOptionPane;

public class Pratica01_2 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        JOptionPane.showMessageDialog(null, "O valor do numero digitado e: " + num);
    }
}
