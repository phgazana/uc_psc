import javax.swing.JOptionPane;

public class Solucao26 {
    public static void main(String[] args) {

        /*26) Escrever um algoritmo que lê 2 números reais. A seguir, é apresentado, para o
usuário, o menu a seguir:
“Operações Disponíveis:
1. Adição
2. Subtração
3. Multiplicação
4. Divisão
9. Sair do Programa
Digite o número de ordem da opção desejada: “
Se a opção for 1, o algoritmo deve somar os dois valores lidos; se for 2, o algoritmo
deve fazer o primeiro valor menos o segundo; se for 3, o algoritmo deve multiplicar
os valores lidos; se for 4, o algoritmo deve dividir o primeiro pelo segundo valor lido,
desde que este não seja zero (o algoritmo deve ter tratamento especial para este
caso).
O algoritmo deve escrever o resultado da operação escolhida. Se o usuário digitar 9,
o algoritmo deve ser encerrado. Enquanto o valor da opção 9 não for digitado, o menu
deve ser apresentado novamente.*/

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

