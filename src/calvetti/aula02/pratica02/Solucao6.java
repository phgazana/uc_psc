public class Solucao6 {
    public static void main(String[] args) {

        /*6) Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a
20 ou menor do que 20.*/

        int numero = 18;

        if(numero > 20){
            System.out.println("Número maior do que 20");
        }
        else{
            if(numero == 20){
                System.out.println("Numero igual a 20");
            }
            else{
                System.out.println("Número menor do que 20");
            }
        }
    }
}
