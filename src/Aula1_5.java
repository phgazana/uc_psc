import javax.swing.JOptionPane;

public class Aula1_5 {
    public static void main(String[] args) {

        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
        String palavra;

        c1 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c2 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c3 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c4 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c5 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c6 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c7 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c8 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c9 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);
        c10 = JOptionPane.showInputDialog("Digite um caracter: ").charAt(0);

        palavra = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;

        JOptionPane.showMessageDialog(null, "A palavra formada foi: " + palavra);

    }
}