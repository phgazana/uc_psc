import javax.swing.JOptionPane;
public class Pratica03_3 {
    public static void main(String[] args){

        int n1, n2, n3, n4, n5;
        int media;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        media = (n1 + n2 + n3 + n4 + n5)/5;

        JOptionPane.showMessageDialog(null,"Média dos valores: " + media);
    }
}
