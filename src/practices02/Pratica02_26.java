import javax.swing.JOptionPane;

public class Pratica02_26 {
    public static void main(String[] args) {

        int n1, n2;
        int maior, menor;
        double quadrado, raiz;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        menor = Math.min(n1, n2);
        maior = Math.max(n1, n2);

        quadrado = Math.pow(menor, 2);
        raiz = Math.sqrt(maior);

        JOptionPane.showMessageDialog(null, "Quadrado do menor número: " + quadrado + "\nRaiz quadrada do maior número: " + raiz);


    }
}

