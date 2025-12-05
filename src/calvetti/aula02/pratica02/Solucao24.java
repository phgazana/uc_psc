import javax.swing.JOptionPane;
import java.util.Arrays;

public class Solucao24 {
    public static void main(String[] args) {

        /*24) Ler cinco números e identificar o maior e o menor de todos (NÃO suponha
números diferentes).*/

        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        }

        Arrays.sort(num);

        int menor = num[0];
        int maior = num[4];

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);


    }
}
