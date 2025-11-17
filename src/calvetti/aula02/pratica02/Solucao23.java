import javax.swing.JOptionPane;
import java.util.Arrays;

public class Solucao23 {
    public static void main(String[] args) {

        /*5) Ler três números e armazená-los em três variáveis com os seguintes nomes, de
acordo com seus valores relativos: maior, intermediário e menor (suponha números
diferentes).*/

        int[] num = new int[3];

        for (int i = 0; i != 3; i++) {

            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        }

        Arrays.sort(num);

        int menor = num[0];
        int inter = num[1];
        int maior = num[2];

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + inter + "\nMenor: " + menor);
    }
}
