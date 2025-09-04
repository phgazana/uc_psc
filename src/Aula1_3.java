import javax.swing.JOptionPane;

public class Aula1_3 {
    public static void main(String[] args) {

        String dia, mes, ano;

        dia = JOptionPane.showInputDialog("Dia de nascimento: ");
        mes = JOptionPane.showInputDialog("Mes de nascimento: ");
        ano = JOptionPane.showInputDialog("Ano de nascimento: ");

        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);

    }
}
