import javax.swing.JOptionPane;

public class Pratica02_5 {
    public static void main(String[] args) {

        double n1, n2, n3, menor = 0, maior = 0, inter = 0;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else {
            inter = n1;
        }
        if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else {
            inter = n2;
        }
        if (n3 > n1 && n3 > n2) {
            maior = n3;
        } else if (n3 < n1 && n3 < n2) {
            menor = n3;
        } else {
            inter = n3;
        }

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + inter + "\nMenor: " + menor);
    }
}
