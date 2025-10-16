import javax.swing.JOptionPane;

public class NumerosInt {
    public static void main(String[] args) {
        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));

        int maior;
        int menor;
        int medio;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        int soma = n1 + n2 + n3;
        medio = soma - (maior + menor);

        JOptionPane.showMessageDialog(null, "Menor: " + menor + "\nMedio: " + medio + "\nMaior: " + maior);
    }
}
