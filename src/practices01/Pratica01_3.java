import javax.swing.JOptionPane;

public class Pratica01_3 {
    public static void main(String[] args) {

        int dia, mes, ano;
        String dataFormada;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de nascimento:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));

        dataFormada = String.format("%02d/%02d/%04d", dia, mes, ano);

        JOptionPane.showMessageDialog(null, dataFormada);
    }
}
