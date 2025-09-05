import javax.swing.JOptionPane;

public class Pratica01_7 {
    public static void main(String[] args) {

        int idade, dias, diasAproximados;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        dias = 365;
        diasAproximados = idade * dias;

        JOptionPane.showMessageDialog(null, "Aproximadamente " + diasAproximados + " dias vividos.");
    }
}
