
import java.util.Scanner;

public class Aula1_12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String data, dia, mes, ano;

        System.out.print("Data de nascimento:");
        data = entrada.nextLine();

        dia = data.substring(0, 2);
        mes = data.substring(3, 5);
        ano = data.substring(6, 8);

        System.out.println(dia + "\n" + mes + "\n" + ano);
    }
}
