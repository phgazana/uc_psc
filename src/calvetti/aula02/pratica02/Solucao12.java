public class Solucao12 {
    public static void main(String[] args) {

        /*12) Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não
é divisível por nenhum destes.*/

        int numero = 10;

        if (numero % 5 == 0 || numero % 10 == 0 || numero % 2 == 0) {
            System.out.println("Ele é divisível por 10, por 5 e por 2");
        } else {
            System.out.println("Ele não é divisível por 10, por 5 e por 2");
        }
    }
}
