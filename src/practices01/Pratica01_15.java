import javax.swing.JOptionPane;

public class Pratica01_15 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
        double resultado = Math.log(num) / Math.log(base);

        JOptionPane.showMessageDialog(null, "Logaritmo do numero: " + Math.floor(resultado));
    }
}
