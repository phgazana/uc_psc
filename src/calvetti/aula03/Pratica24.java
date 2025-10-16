import javax.swing.JOptionPane;

public class Pratica03_24 {
    public static void main(String[] args) {

        double valor, total = 0;
        int quantidade;

        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));

            if (quantidade != 0) {
                total += valor * quantidade;
            } else {
                JOptionPane.showMessageDialog(null, "Total a pagar: " + total);
            }

        } while (quantidade != 0);


    }
}
