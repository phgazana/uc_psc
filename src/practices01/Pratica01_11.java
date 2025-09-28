import javax.swing.JOptionPane;

public class Pratica01_11 {
    public static void main(String[] args) {

        int valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor pendente"));

        double valorFinal = valorInicial * Math.pow(1 + 10.0 / 100, 8);

        JOptionPane.showMessageDialog(null, "Em 8 meses o valor pendente sera: " + Math.floor(valorFinal));

    }
}