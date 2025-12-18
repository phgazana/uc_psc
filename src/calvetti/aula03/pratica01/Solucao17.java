import javax.swing.JOptionPane;

public class Solucao17 {
    public static void main(String[] args) {

        /*17) Faça um algoritmo para imprimir na tela uma tabela de conversão de polegadas
para centímetros. Deseja-se que a tabela conste de valores desde 1 até 20 polegadas.
Lembre-se que 1 polegada equivale a 2,54 cm.*/

        double conversao, cm = 2.54;
        int polegadas;

        polegadas = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para conversão de polegadas para cm"));

        if (polegadas >= 1 && polegadas <= 20) {
            conversao = polegadas * cm;
            JOptionPane.showMessageDialog(null, conversao + "cm");
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido 1-20");
        }
    }
}
