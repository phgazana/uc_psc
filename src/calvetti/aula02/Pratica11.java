import javax.swing.JOptionPane;

public class Pratica02_11 {
    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));

        if (n1 >= 20 && n1 <= 90) {
            JOptionPane.showMessageDialog(null, "Está entre 20 e 90");
        } else {
            JOptionPane.showMessageDialog(null, "Não está entre 20 e 90");
        }
    }
}
