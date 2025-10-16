public class Solucao5 {
    public static void main(String[] args){

        /*5) Crie um algoritmo que calcule o valor de uma dívida, submetida a juros
compostos: Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros
(em %) e N representa o número de meses. Responda: se você deve para o cartão de
crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses?*/

        double valorInicial = 100;

        double valorFinal = valorInicial * Math.pow(1 + 10.0 / 100, 8);

        System.out.print(valorFinal);
    }
}
