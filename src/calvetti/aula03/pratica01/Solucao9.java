public class Solucao9 {
    public static void main(String[] args) {

        /*9) Imprimir na tela todos os números de 1 a 100 e a soma deles.*/

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma+=i;
            System.out.println("Números: " + i + " || Soma: " + soma);
        }
    }
}

