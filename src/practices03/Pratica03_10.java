import javax.swing.JOptionPane;

public class Pratica03_10 {
    public static void main(String[] args) {

        int num;
        int i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        while (num != -999) {
            JOptionPane.showMessageDialog(null, "Divisores de " + num + ":");
            i = 1;

            while (i <= num) {

                if (num % i == 0) {

                    JOptionPane.showMessageDialog(null, i);
                }
            i++;
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        }
    }
}
