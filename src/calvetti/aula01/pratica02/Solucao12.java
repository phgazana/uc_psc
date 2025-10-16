public class Solucao12 {
    public static void main(String[] args) {

        /*12) Entre com uma data em uma variável do tipo String no formato dd/mm/aa e
imprimir dia, mês e ano separados.*/

        String data = "06/12/06";

        System.out.print(data.substring(0, 2) + "\n" + data.substring(3, 5) + "\n" + data.substring(6, 8));
    }
}
