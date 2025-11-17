import javax.swing.JOptionPane;

public class Vetor04 {
    public static void main(String[] args) {

        double vet[] = new double[6];

        int i;
        double soma = 0;

        for (i = 0; i < 5; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite cinco notas"));
            soma += vet[i];
        }
        System.out.println(soma / i);
    }
}
