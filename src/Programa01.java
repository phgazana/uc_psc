import javax.swing.JOptionPane;

public class Programa01 {
    public static void main(String[] args) {
        //Declaração de váriaveis

        int n1, n2, n3, resultado;

        //Carregando valores
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
        //Calculando total
        resultado = n1 + n2 + n3;

        //Avaliando condição
        if (resultado >= 120) {
            JOptionPane.showMessageDialog(null, "Ótimo");
        } else {
            JOptionPane.showMessageDialog(null, "Péssimo");
        }
    }
}
