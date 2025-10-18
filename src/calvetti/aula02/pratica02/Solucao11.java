public class Solucao11 {
    public static void main(String[] args) {

        /*11) Entrar com um número e informar se ele é divisível por 3 e por 7.*/

        int numero = 7;

        if (numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("É divisível por 3 e por 7");
        } else {
            System.out.println("Não é divisível por 3 e por 7");
        }
    }
}
