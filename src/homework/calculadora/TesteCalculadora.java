import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {

        char resultado;
        do {
            resultado = JOptionPane.showInputDialog("1.Soma \n2.Subtracão \n3.Multiplicacão \n4.Divisão \n5.Sair").charAt(0);

            if (resultado == '5') {
                break;
            }

            double a = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero:"));

            Calculadora calculadora = new Calculadora(a, b);

            switch (resultado) {
                case '1':
                    JOptionPane.showMessageDialog(null, calculadora.somar());
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, calculadora.subtrair());
                    break;
                case '3':
                    JOptionPane.showMessageDialog(null, calculadora.multiplicar());
                    break;
                case '4':
                    JOptionPane.showMessageDialog(null, calculadora.dividir());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digito invalido");
            }
        } while (resultado != '5');
    }
}

