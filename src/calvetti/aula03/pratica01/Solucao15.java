import javax.swing.JOptionPane;

public class Solucao15 {
    public static void main(String[] args) {

        /*15) Entrar com vários números e imprimir o maior. O algoritmo para quando se digita
-9999.*/

        int maior;
        int num;

        maior = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));


        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (num > maior && num != -9999) {
                maior = num;
            }
        } while (num != -9999);

        JOptionPane.showMessageDialog(null, "Maior número: " + maior);
    }
}


