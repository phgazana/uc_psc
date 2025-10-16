import javax.swing.JOptionPane;

public class Solucao10 {
    public static void main(String[] args) {

       /*10) Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três
frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade
da segunda, segunda metade da terceira, segunda metade da segunda, primeira
metade da primeira, primeira metade da terceira, segunda metade da primeira.
Concatene então as três frases originais e imprima o resultado. Na linha de baixo,
escreva a frase embaralhada e compare o resultado;*/

        String f1, f2, f3, f1_1, f2_1, f3_1, f1_2, f2_2, f3_2, concatenada, embaralhada;
        int m1, m2, m3;

        f1 = JOptionPane.showInputDialog("Primeira frase:");
        f2 = JOptionPane.showInputDialog("Segunda frase:");
        f3 = JOptionPane.showInputDialog("Terceira frase:");

        m1 = f1.length() / 2;
        m2 = f2.length() / 2;
        m3 = f3.length() / 2;

        f1_1 = f1.substring(0, m1);
        f1_2 = f1.substring(m1);

        f2_1 = f2.substring(0, m2);
        f2_2 = f2.substring(m2);

        f3_1 = f3.substring(0, m3);
        f3_2 = f3.substring(m3);

        concatenada = f1 + f2 + f3;
        embaralhada = f2_1 + f3_2 + f2_2 + f1_1 + f3_1 + f1_2;

        JOptionPane.showMessageDialog(null, concatenada + " || " + embaralhada);

    }
}

