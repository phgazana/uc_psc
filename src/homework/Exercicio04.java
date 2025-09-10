import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));


        JOptionPane.showMessageDialog(null, "O antecessor do número digitado é: " + (num - 1));

    }
}
