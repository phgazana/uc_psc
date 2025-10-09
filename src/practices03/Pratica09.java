import javax.swing.JOptionPane;

public class Pratica03_9 {
    public static void main(String[] args) {

        int i = 1, soma = 0;

        while (i <= 100) {
            JOptionPane.showMessageDialog(null, "Contador: " + i + "\nSoma: " + soma);
            soma = soma + i;
            i++;

        }
    }
}
