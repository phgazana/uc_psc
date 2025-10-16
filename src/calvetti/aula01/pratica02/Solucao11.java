public class Solucao11 {
    public static void main(String[] args) {

        /*11) Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e
imprimir dia, mês e ano separados;*/

        int data = 61206;
        int dia = data % 100;
        int mes = (data / 100) % 100;
        int ano = data % 10;

        String dataFormatada = String.format("%02d %02d %02d", dia, mes, ano);

        System.out.print(dataFormatada);
    }
}
