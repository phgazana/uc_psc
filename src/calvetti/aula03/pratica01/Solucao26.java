import javax.swing.JOptionPane;

public class Solucao26 {
    public static void main(String[] args) {

        String operacao;
        double num1, num2;
        double resultado = 0;

        do {
            operacao = JOptionPane.showInputDialog("Operações Disponíveis: \n1. Adição \n2. Subtração  \n3. Multiplicação \n4. Divisão \n9. Sair do Programa \nDigite o número de ordem da opção desejada:");

            switch (operacao) {
                case "1":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    resultado = num1 + num2;
                    break;
                case "2":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    resultado = num1 - num2;
                    break;
                case "3":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    resultado = num1 * num2;
                    break;
                case "4":
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                    resultado = num1 / num2;
                    break;
                case "9":
                    break;
            }
            if (!operacao.equals("9")) {
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }
        } while (!operacao.equals("9"));
    }
}

