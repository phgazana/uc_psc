import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        int idade, dias, diasAproximados;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        dias = 365;
        diasAproximados = idade * dias;

        JOptionPane.showMessageDialog(null, "Aproximadamente " + diasAproximados + " dias vividos.");
    }
}
