import javax.swing.JOptionPane;

public class Solucao4 {
    public static void main(String[] args) {

        /*4) Crie um algoritmo que leia três Strings por meio do JOptionPane e escreva a soma
do comprimento destas Strings;*/

        String s1 = JOptionPane.showInputDialog("Digite algo");
        String s2 = JOptionPane.showInputDialog("Digite algo");
        String s3 = JOptionPane.showInputDialog("Digite algo");

        JOptionPane.showMessageDialog(null, s1.length() + s2.length() + s3.length());
    }
}
