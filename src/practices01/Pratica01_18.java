
import javax.swing.JOptionPane;

public class Pratica01_18 {

    public static void main(String[] args) {

        String dia, mes, ano;

        String data = JOptionPane.showInputDialog("Digite a data (dd/mm/aa):");
        dia = data.substring(0, 2);
        mes = data.substring(3, 5);
        ano = data.substring(6, 8);

        JOptionPane.showMessageDialog(null, dia + " " + mes + " " + ano);

    }
}
