import javax.swing.JOptionPane;

public class Pratica01_12{
    public static void main(String[] args){

        int num, dezena;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
        dezena = (num / 10) % 10;

        JOptionPane.showMessageDialog(null, dezena);


    }
}