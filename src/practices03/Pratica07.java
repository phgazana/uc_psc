import javax.swing.JOptionPane;

public class Pratica03_7 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 500) {

            if (i % 5 == 0) {
                JOptionPane.showMessageDialog(null, i);
            }
            i++;
        }
    }
}
