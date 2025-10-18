import javax.swing.JOptionPane;

public class Solucao2 {
    public static void main(String[] args) {

        /*2) Construir um algoritmo que leia três números que representam os lados de um
triângulo e que imprima se o triângulo é equilátero (três lados iguais), isósceles (dois
lados iguais) ou escaleno (três lados diferentes). Antes, não se esqueça de testar se
os três lados realmente formam um triângulo. Informe o usuário caso não formem.*/


        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (!(n1 + n2 > n3 && n1 + n3 > n2 && n3 + n2 > n1)) {
            JOptionPane.showMessageDialog(null, "Não podem ser lados de um triângulo");
        } else {
            if (n1 == n2 && n2 == n3) {
                JOptionPane.showMessageDialog(null, "Equilátero (três lados iguais)");
            } else {
                if (n1 == n2 || n2 == n3 || n3 == n1) {
                    JOptionPane.showMessageDialog(null, "Isósceles (dois lados iguais)");
                } else {
                    JOptionPane.showMessageDialog(null, "Escaleno (três lados diferentes)");
                }
            }
        }
    }
}

