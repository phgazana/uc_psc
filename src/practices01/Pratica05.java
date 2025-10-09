import javax.swing.JOptionPane;

public class Pratica01_5 {
    public static void main(String[] args) {

        String palavra = "";

        for (int i = 1; i <= 10; i++) {
            char caracter = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
            palavra = palavra + caracter;
        }

        JOptionPane.showMessageDialog(null, palavra);
    }
}


