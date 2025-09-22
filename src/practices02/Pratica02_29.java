import javax.swing.JOptionPane;

public class Pratica02_29 {
    public static void main(String[] args) {

        int n1, n2, n3;
        int maior, inter, menor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            maior = n1;
            inter = n2;
            menor = n3;
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            maior = n2;
            inter = n1;
            menor = n3;
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            maior = n3;
            inter = n1;
            menor = n2;
        } else {
            maior = n3;
            inter = n2;
            menor = n1;
        }
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + inter + "\nManor: " + menor);
    }
}
