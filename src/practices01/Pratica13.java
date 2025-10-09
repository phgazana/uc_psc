import javax.swing.JOptionPane;

public class Pratica01_13 {
    public static void main(String[] args) {

        double seno, cosseno, tangente, secante, cossecante, cotangente;

        double angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o angulo em graus:"));
        double rad = Math.toRadians(angulo);

        seno = Math.sin(rad);
        cosseno = Math.cos(rad);
        tangente = Math.tan(rad);
        secante = 1 / cosseno;
        cossecante = 1 / seno;
        cotangente = 1 / tangente;

        JOptionPane.showMessageDialog(null, "Seno: " + String.format("%.4f", seno) + "\nCosseno: " + String.format("%.4f", cosseno) + "\nTangente: " + String.format("%.4f", tangente) + "\nSecante: " + String.format("%.4f", secante) + "\nCossecante: " + String.format("%.4f", cossecante) + "\nCotangente: " + String.format("%.4f", cotangente));
    }
}