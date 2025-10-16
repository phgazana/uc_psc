import javax.swing.JOptionPane;

public class ExemploDoWhile {
    public static void main(String[] args) {

        double nota1, nota2;
        int i = 1;

        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            JOptionPane.showMessageDialog(null, "Media " + (nota1 + nota2) / 2);
            i = i + 1;
        } while (i <= 4);
        {

        }
    }
}
