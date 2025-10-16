import javax.swing.JOptionPane;

public class Solucao3 {
    public static void main(String[] args) {

    /*3) Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
método double Math.pow(base, expoente), onde base e expoente são números
reais;*/

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));

        JOptionPane.showMessageDialog(null, Math.pow(numero, 2));
    }
}