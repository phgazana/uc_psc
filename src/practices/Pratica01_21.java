import javax.swing.JOptionPane;

public class Pratica01_21 {
    public static void main(String[] args) {

        int dividendo, divisor, quiocente, resto;

        dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));

        quiocente = dividendo / divisor;
        resto = dividendo % divisor;

        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + "\n" + "Divisor: " + divisor + "\n" + "Quiocente: " + quiocente + "\n" + "Resto: " + resto);

    }
}
