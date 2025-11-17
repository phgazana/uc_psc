import javax.swing.*;

public class Vetor05 {
    public static void main(String[] args) {

        int vet[] = new int[5];

        for (int i = 0; i < 5; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        }

        int menor = vet[0];
        int maior = vet[0];

        for (int i = 0; i < 5; i++) {
            if (vet[i] < menor)
                menor = vet[i];

            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (vet[i] == menor)
                System.out.printf("v[%d] = %2d <--- menor valor\n", i, vet[i]);
            else if (vet[i] == maior)
                System.out.printf("v[%d] = %2d <--- maior valor\n", i, vet[i]);
            else System.out.printf("v[%d] = %2d\n", i, vet[i]);
        }
    }
}

