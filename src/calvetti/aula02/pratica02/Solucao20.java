public class Solucao20 {
    public static void main(String[] args) {

        /*20) Criar um algoritmo que deixe entrar com dois números e imprimir o quadrado
do menor número e a raiz quadrada do maior número, se for possível (suponha
números diferentes).*/

        int num1 = 0;
        int num2 = 1;

        if (num1 < 0 || num2 < 0) {
            System.out.println("Número inválido");
        } else {
            if (num1 > num2) {
                System.out.println(Math.pow(num2, 2) + " " + Math.sqrt(num1));
            } else {
                System.out.println(Math.pow(num1, 2) + " " + Math.sqrt(num2));
            }
        }
    }
}
