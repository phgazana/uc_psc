import javax.swing.JOptionPane;

public class Pratica01_6 {
    public static void main(String[] args) {

        char milhar, centena, dezena, unidade;
        String resultado;

        milhar = JOptionPane.showInputDialog("Digite um numero:").charAt(0);
        centena = JOptionPane.showInputDialog("Digite um numero:").charAt(0);
        dezena = JOptionPane.showInputDialog("Digite um numero:").charAt(0);
        unidade = JOptionPane.showInputDialog("Digite um numero:").charAt(0);

        resultado = "" + milhar + centena + dezena + unidade;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
