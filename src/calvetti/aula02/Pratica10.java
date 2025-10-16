import javax.swing.JOptionPane;

public class Pratica02_10 {
    public static void main(String[] args) {

        int n1, n2, n3;
        int menor, medio, maior;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        if (n2 > n3) {
            medio = n2;
            menor = n3;
        } else {
            medio = n3;
            menor = n2;
        }

        if (n1 > n3) {
            medio = n1;
            menor = n3;
        } else {
            medio = n3;
            menor = n1;
        }

        if (n1 > n2) {
            medio = n1;
            menor = n2;
        } else {
            medio = n2;
            menor = n1;
        }

        JOptionPane.showMessageDialog(null, "Menor: " + menor + "\nMedio:" + medio + "\nMaior: " + maior);
    }
}

