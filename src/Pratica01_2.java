import javax.swing.JOptionPane;

public class Pratica01_2 {
    public static void main(String[] args) {

        String num;
        int arm;
        num = JOptionPane.showInputDialog(
                "Digite um número:");
        arm = Integer.parseInt(num);

        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + arm);

    }
}
