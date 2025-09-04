
import java.util.Scanner;

public class Aula1_10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String f1, f2, f3, f1_1, f2_1, f3_1, f1_2, f2_2, f3_2, concatenada, embaralhada;
        int m1, m2, m3;

        System.out.print("Primeira frase:");
        f1 = entrada.nextLine();

        System.out.print("Segunda frase:");
        f2 = entrada.nextLine();

        System.out.print("Terceira frase:");
        f3 = entrada.nextLine();

        m1 = f1.length() / 2;
        m2 = f2.length() / 2;
        m3 = f3.length() / 2;

        //Primeira-segunda metade da primeira
        f1_1 = f1.substring(0, m1);
        f1_2 = f1.substring(m1);

        //Primeira-segunda metade da segunda
        f2_1 = f2.substring(0, m2);
        f2_2 = f2.substring(m2);

        //Primeira-segunda metade da terceira
        f3_1 = f3.substring(0, m3);
        f3_2 = f3.substring(m3);

        //Frase concatenada
        concatenada = f1 + f2 + f3;

        //Frase embaralhada
        embaralhada = f2_1 + f3_2 + f2_2 + f1_1 + f3_1 + f1_2;

        System.out.println(concatenada + " || " + embaralhada);

    }
}
