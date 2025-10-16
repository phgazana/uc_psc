import javax.swing.JOptionPane;

public class Solucao15 {
    public static void main(String[] args) {

        /*15) Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto;*/

        int dividendo, divisor, quiocente, resto;

        dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));

        quiocente = dividendo / divisor;
        resto = dividendo % divisor;

        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + "\n" + "Divisor: " + divisor + "\n" + "Quiocente: " + quiocente + "\n" + "Resto: " + resto);

    }
}