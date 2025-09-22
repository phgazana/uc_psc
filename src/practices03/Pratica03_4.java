import javax.swing.JOptionPane;

public class Pratica03_4 {
    public static void main(String[] args) {

        int i = 0, numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (numero >= 100 && numero <= 200) {
                i++;
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null,"Foram informados " + i + " números entre 100 e 200");
    }
}