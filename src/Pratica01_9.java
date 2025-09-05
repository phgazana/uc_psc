import javax.swing.JOptionPane;

public class Pratica01_9 {
    public static void main(String[] args) {

        int num;
        double base, resultado;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        base = num;


        resultado = Math.pow(base, 2);

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);


    }
}
