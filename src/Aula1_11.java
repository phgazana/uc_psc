
import java.util.Scanner;

public class Aula1_11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String data, dia, mes, ano;
        int num;

        System.out.print("Data de nascimento(ddmmaa):");
        num = entrada.nextInt();

        data = String.valueOf(num);
        dia = data.substring(0, 1);
        mes = data.substring(1, 3);
        ano = data.substring(3, 5);

        System.out.println(dia + "\n" + mes + "\n" + ano);

    }
}
