import javax.swing.JOptionPane;

public class Pratica01_20 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        double area, raio;

        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio:"));


        area = PI * Math.pow(raio, 2);

        JOptionPane.showMessageDialog(null, "Área do circulo: " + area);
    }
}
