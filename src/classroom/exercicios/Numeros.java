import javax.swing.JOptionPane;

public class Numeros {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 100) {

            JOptionPane.showMessageDialog(null, "Número: " + i);
            i = i + 1;
        }

    }
}
