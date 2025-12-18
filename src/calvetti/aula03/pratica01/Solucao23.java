import javax.swing.JOptionPane;

public class Solucao23 {
    public static void main(String[] args) {

        /*23) Criar um algoritmo que leia um número que servirá para controlar os números
pares que serão impressos a partir de 2 Exemplo: quantos 4, imprime 2, 4, 6, 8.*/

        int num, par;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos números pares serão impressos:"));

        for (int i = 1; i <= num; i++) {

            par = 2 * i;

            JOptionPane.showMessageDialog(null, par);
        }
    }
}
