import javax.swing.JOptionPane;

public class ExemploFor {

    public static void main(String[] args) {

        double nota1, nota2;

        for (int i = 1; i <= 5; i = i + 1) {


            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            JOptionPane.showMessageDialog(null, "Media " + (nota1 + nota2) / 2);
            i = i + 1;
        }
    }
}