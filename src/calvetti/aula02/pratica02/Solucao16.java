import javax.swing.JOptionPane;

public class Solucao16 {
    public static void main(String[] args) {

        /*16) Crie um algoritmo que leia dois números e imprimir uma mensagem dizendo se
são iguais ou diferentes.*/

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));

        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Número iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Números diferentes");
        }
    }
}
