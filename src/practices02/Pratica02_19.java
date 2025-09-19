import javax.swing.JOptionPane;

public class Pratica02_19 {
    public static void main(String[] args) {

        int n1, decimais;


        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        decimais = (n1 / 10) % 10;

        if (decimais % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Par");
        } else {
            JOptionPane.showMessageDialog(null, "Impar");
        }
    }
}
