import javax.swing.JOptionPane;

public class Solucao22 {
    public static void main(String[] args) {

        int limite;

        /*22) Criar um algoritmo que leia um número que será o limite superior de um intervalo
e imprimir todos os números ímpares menores do que esse número. Exemplo: limite
15, imprime 1, 3,5, 7, 9, 11, 13.*/

        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o número limite:"));

        for (int i = 1; i < limite; i++) {

            if(i % 2 != 0){
                JOptionPane.showMessageDialog(null,i);
            }
        }


        }
    }
