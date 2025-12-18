import javax.swing.JOptionPane;

public class Solucao20 {
    public static void main(String[] args) {

        /*20) Criar um algoritmo que leia um número que será o limite superior de um intervalo
e o incremento. Imprimir todos os números do intervalo de 0 até esse número, de
incremento em incremento. Ex: limite 20, incremento 5; vai imprimir 0, 5, 10, 15, 20.*/

        int limite, incremento;

        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o número limite:"));
        incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));

        for (int i = 0; i <= limite; i += incremento) {

            JOptionPane.showMessageDialog(null, i);
        }
    }
}

