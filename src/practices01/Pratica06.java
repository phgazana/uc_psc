import javax.swing.JOptionPane;

public class Pratica01_6 {
    public static void main(String[] args) {

        char milhar, centena, dezena, unidade;
        String n1, n2, n3, n4;

        n1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        n2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        n3 = JOptionPane.showInputDialog("Digite o terceiro numero:");
        n4 = JOptionPane.showInputDialog("Digite o quarto numero:");

        milhar = n1.charAt(0);
        centena = n2.charAt(0);
        dezena = n3.charAt(0);
        unidade = n4.charAt(0);

        String vazia = " ";
        vazia += "" + milhar + centena + dezena + unidade;

        JOptionPane.showMessageDialog(null, vazia);
    }
}
