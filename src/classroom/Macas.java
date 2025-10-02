import javax.swing.JOptionPane;

public class Macas {
    public static void main(String[] args) {

        double quantidadeMaca = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de macas:"));
        double valorMaca;

        if (quantidadeMaca < 12) {
            valorMaca = 0.30;
        } else {
            valorMaca = 0.25;
        }

        JOptionPane.showMessageDialog(null, "Valor total: " + quantidadeMaca * valorMaca);
    }
}
