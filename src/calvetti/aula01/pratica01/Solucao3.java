import javax.swing.JOptionPane;

public class Solucao3 {
    public static void main(String[] args) {

        /*3) Crie um algoritmo que leia 3 números que representem uma data,
                respectivamente dia, mês e ano. Depois imprima a data usando o formato
        dia/mês/ano;*/

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        String data = String.format("%02d/%02d/%04d", dia, mes, ano);

        JOptionPane.showMessageDialog(null, data);
    }
}
