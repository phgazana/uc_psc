import javax.swing.JOptionPane;

public class Solucao22 {
    public static void main(String[] args) {

        /*22) Ler três números e armazenar o maior número na variável de nome maior
(suponha números diferentes)..*/


        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        JOptionPane.showMessageDialog(null, maior);
    }
}
