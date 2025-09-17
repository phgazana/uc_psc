import javax.swing.JOptionPane;

public class Pratica02_6 {

    public static void main(String[] args) {

        double n1, n2, n3, n4, n5, maior, menor;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número"));
        n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quinto número:"));

        maior = n1;
        menor = n1;

        if (n2 > maior)
            maior = n2;
        if (n2 < menor)
            menor = n2;
        if (n3 > maior)
            maior = n3;
        if (n3 < menor)
            menor = n3;
        if (n4 > maior)
            maior = n4;
        if (n4 < menor)
            menor = n4;
        if (n5 > maior)
            maior = n5;
        if (n5 < menor)
            menor = n5;


        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
    }
}
