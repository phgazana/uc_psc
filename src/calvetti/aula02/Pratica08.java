import javax.swing.JOptionPane;

public class Pratica02_8 {
    public static void main(String[] args) {

        int n1, n2, soma;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        soma = n1 + n2;
        if (soma <= 20) {
            JOptionPane.showMessageDialog(null, "Valor subtraido por cinco: " + (soma - 5));
        } else {
            JOptionPane.showMessageDialog(null, "Valor sem subtração: " + soma);
        }
    }
}
