import javax.swing.JOptionPane;

public class Solucao1 {
    public static void main(String[] args) {

    /*1) Crie um algoritmo que leia três palavras, separadamente, e as apresente na tela
    na ordem contrária em que foram digitadas, separadas por espaço;*/

        String p1 = JOptionPane.showInputDialog("Digite uma palavra:");
        String p2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
        String p3 = JOptionPane.showInputDialog("Digite a terceira palavra:");

        JOptionPane.showMessageDialog(null, p3 + " " + p2 + " " + p1);

    }
}
