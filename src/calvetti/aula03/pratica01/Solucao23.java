import javax.swing.JOptionPane;

public class Solucao23 {
    public static void main(String[] args) {

        int num, par;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos números pares serão impressos:"));

        for (int i = 1; i <= num; i++) {

            par = 2 * i;

            JOptionPane.showMessageDialog(null, par);
        }
    }
}
