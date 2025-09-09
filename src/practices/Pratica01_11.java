import javax.swing.JOptionPane;

public class Pratica01_11 {
    public static void main(String[] args) {

        double Valor_Inicial, Valor_Final, J, N;


        Valor_Inicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pendente:"));
        N = Double.parseDouble(JOptionPane.showInputDialog("Digite os meses com o valor pendente:"));
        J = 10.0;

        Valor_Final = Valor_Inicial * Math.pow((1 + J / 100), N);

        JOptionPane.showMessageDialog(null, "Juros pendente: " + Valor_Final);
    }
}