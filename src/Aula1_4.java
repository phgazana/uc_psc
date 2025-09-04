import javax.swing.JOptionPane;

public class Aula1_4 {
    public static void main(String[] args) {

        double peso;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg");
    }

}

