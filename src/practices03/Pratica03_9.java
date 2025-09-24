import javax.swing.JOptionPane;

public class Pratica03_9 {
    public static void main(String[] args) {

        int num = 1;
        int i = 1;

        while (i <= 100) {

            JOptionPane.showMessageDialog(null, "Número: " + i + "\nSoma: " + num);

            num = num + i;
            i++;
        }
    }
}
