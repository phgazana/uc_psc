import javax.swing.JOptionPane;

public class Pratica03_5 {
    public static void main(String[] args) {

        String nome;

        do {
            nome = JOptionPane.showInputDialog("Digite um nome:");

            if (!nome.equalsIgnoreCase("FIM")) {
                JOptionPane.showMessageDialog(null, nome);
            }

        } while (!nome.equalsIgnoreCase("FIM"));
    }
}
