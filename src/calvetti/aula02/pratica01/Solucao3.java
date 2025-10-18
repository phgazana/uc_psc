public class Solucao3 {
    public static void main(String[] args) {

      /*3) Entrar com um verbo no infinitivo e imprimir se o verbo é da 1a conjugação
(terminados em ar), da 2a conjugação (terminados em er), da 3a conjugação
(terminados em ir), se não está no infinitivo (não termina em r) ou se provavelmente
nem é verbo no infinitivo (termina em or ou em ur).*/

        String verbo = "Paulo";
        int tamanho = verbo.length();
        if (tamanho < 2) {
            System.out.println("Não está no infinitivo (muito curto)");
        }
        String ultimaLetra = verbo.substring(tamanho - 1).toLowerCase();
        String conjugacao = verbo.substring(tamanho - 2).toLowerCase();

        if (!(ultimaLetra.equals("r"))) {
            System.out.print("Não está no infinitivo (não termina em r)");
        } else {
            if (conjugacao.equals("ar")) {
                System.out.print("1ª conjugação (terminando em ar)");
            } else {
                if (conjugacao.equals("er")) {
                    System.out.print("2ª conjugação (terminando em er)");
                } else {
                    if (conjugacao.equals("ir")) {
                        System.out.print("3ª conjugação (terminando em ir)");
                    } else {
                        if (conjugacao.equals("or") || conjugacao.equals("ur")) {
                            System.out.println("Provavelmente nem é verbo no infinitivo (termina em or ou em ur)");
                        }
                    }
                }
            }
        }
    }
}
