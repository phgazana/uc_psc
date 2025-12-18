import javax.swing.JOptionPane;

public class Solucao24 {
    public static void main(String[] args) {

        /*24) Escrever um algoritmo que lê repetidamente o valor do preço de uma mercadoria
e a quantidade de itens comprados dessa mercadoria. Quando a quantidade lida for
igual a zero, o algoritmo deve mostrar o total a ser pago. O algoritmo não deve
computar valores negativos de preço ou de quantidade; neste caso, o algoritmo deve
pedir que o usuário digite novamente o valor do preço ou da quantidade digitados
indevidamente (sugestão: usar outro loop faça-enquanto para cada caso).
OBS.: Considerar a quantidade de mercadorias compradas é desconhecida.*/

        double valor, total = 0;
        int quantidade;

        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));

            if (quantidade != 0) {
                total += valor * quantidade;
            } else {
                JOptionPane.showMessageDialog(null, "Total a pagar: " + total);
            }

        } while (quantidade != 0);


    }
}
