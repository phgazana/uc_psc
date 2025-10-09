import javax.swing.JOptionPane;

public class Pratica02_30 {
    public static void main(String[] args) {

        int n1, n2, n3, n4, n5;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        int maior = n1, menor = n1;

        if (n2 > maior) {
            maior = n2;
        } else if (n3 > maior) {
            maior = n3;
        } else if (n4 > maior) {
            maior = n4;
        } else if (n5 > maior) {
            maior = n5;
        } else if (n2 < menor) {
            menor = n2;
        } else if (n3 < menor) {
            menor = n3;
        } else if (n4 < menor) {
            menor = n4;
        } else if (n5 < menor) {
            menor = n5;
        }
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);

    }
}
