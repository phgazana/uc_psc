import javax.swing.JOptionPane;
import java.util.Arrays;

public class Solucao4 {
    public static void main(String[] args) {

        /*4) Ler três números e escrevê-los em ordem crescente (suponha números
diferentes).*/

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        }

        Arrays.sort(num);

        int menor = num[0];
        int inter = num[1];
        int maior = num[2];

        JOptionPane.showMessageDialog(null, "Menor: " + menor + "\nIntermediário: " + inter + "\nMaior: " + maior);
    }
}