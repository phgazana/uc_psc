import javax.swing.JOptionPane;

public class Pratica01_13 {
    public static void main(String[] args) {

        double angulo, radiano;
        double seno, cosseno, tangente, secante, cossecante, cotangente;

        angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o ângulo em graus:"));

        radiano = Math.toRadians(angulo);

        seno = Math.sin(radiano);
        cosseno = Math.cos(radiano);
        tangente = Math.tan(radiano);
        secante = 1 / cosseno;
        cossecante = 1 / seno;
        cotangente = 1 / tangente;

        JOptionPane.showMessageDialog(null, "Seno: " + seno + "\n" +
                "Cosseno: " + cosseno + "\n" +
                "Tangente: " + tangente + "\n" +
                "Secante: " + secante + "\n" +
                "Cossecante: " + cossecante + "\n" +
                "Cotangente: " + cotangente + "\n");

    }
}