import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args) {

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        char sexo = JOptionPane.showInputDialog("Digite o sexo M/F:").charAt(0);
        sexo = Character.toUpperCase(sexo);

        if (sexo == 'M') {
            double homens = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, "Peso ideal: " + Math.floor(homens));
        } else if (sexo == 'F') {
            double mulheres = (62.1 * altura) - 44.77;
            JOptionPane.showMessageDialog(null, "Peso ideal: " + Math.floor(mulheres));
        } else {
            JOptionPane.showMessageDialog(null, "Entrada invalida");


        }
    }
}
