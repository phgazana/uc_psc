import javax.swing.JOptionPane;

public class Pratica03_15 {
    public static void main(String[] args) {

        int maior;
        int num;

        maior = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));


        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (num > maior && num != -9999) {
                maior = num;
            }
        } while (num != -9999);

        JOptionPane.showMessageDialog(null, "Maior número: " + maior);
    }
}


