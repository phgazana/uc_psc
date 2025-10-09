import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {

        double dolar, real, conversao;

        dolar = 5.43;

        real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais:"));

        conversao = real * dolar;

        JOptionPane.showMessageDialog(null, "Você tem $" + conversao);
    }
}
