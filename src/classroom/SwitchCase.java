import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {

        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota:"));

        switch (nota) {
            case 10:
                JOptionPane.showMessageDialog(null, "Boa, Conceito A");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito C");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Reprovado");
                break;
        }
    }
}
