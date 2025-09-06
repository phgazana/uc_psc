
import java.util.Scanner;

public class Pratica01_19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double resultado, x, a, b, c;

        System.out.print("Entre com o numero x:");
        x = entrada.nextDouble();

        System.out.print("Entre com o numero a:");
        a = entrada.nextDouble();

        System.out.print("Entre com o numero b:");
        b = entrada.nextDouble();

        System.out.print("Entre com o numero c:");
        c = entrada.nextDouble();

        resultado = x = 2 * ((a - c) / 8) - b * 5;

        System.out.println("O resultado do calculo: " + resultado);

    }
}
