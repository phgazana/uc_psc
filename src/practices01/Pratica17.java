
import javax.swing.JOptionPane;

public class Pratica01_17 {
    public static void main(String[] args) {

        int data = Integer.parseInt(JOptionPane.showInputDialog("Digite uma data (ddmmaa):"));
        int dia = data % 100;
        int mes = (data / 100) % 100;
        int ano = data % 10;

        String dataFormada = String.format("%02d %02d %02d", dia, mes, ano);
        JOptionPane.showMessageDialog(null, dataFormada);


    }
}
