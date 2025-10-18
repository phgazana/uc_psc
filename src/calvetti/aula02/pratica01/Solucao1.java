import javax.swing.JOptionPane;

public class Solucao1 {
    public static void main(String[] args) {

        /*1) Construir um algoritmo que leia três números e imprima se eles podem ou não ser
lados de um triângulo. Lembrando que, para ser um triângulo, a soma de dois lados
quaisquer deve ser sempre maior que o lado que ficou de fora da soma.*/

        double n1, n2, n3;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (n1 + n2 > n3 && n1 + n3 > n2 && n3 + n2 > n1) {
            JOptionPane.showMessageDialog(null, "Podem ser lados de um triângulo");
        } else {
            JOptionPane.showMessageDialog(null, "Não podem ser lados de um triângulo");
        }
    }
}
