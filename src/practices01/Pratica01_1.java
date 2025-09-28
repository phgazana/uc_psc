import javax.swing.JOptionPane;

public class Pratica01_1 {
    public static void main(String[] args) {

        String p1, p2, p3;

        p1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
        p2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
        p3 = JOptionPane.showInputDialog("Digite a terceira palavra:");

        JOptionPane.showMessageDialog(null, p3 + " " + p2 + " " + p1);
    }
}
