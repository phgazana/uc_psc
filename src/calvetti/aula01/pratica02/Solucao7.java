public class Solucao7 {
    public static void main(String[] args) {

        /*7) Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante,
cossecante e cotangente;*/

        double seno, cosseno, tangente, secante, cossecante, cotangente;

        double angulo = 90;
        double rad = Math.toRadians(angulo);

        seno = Math.sin(rad);
        cosseno = Math.cos(rad);
        tangente = Math.tan(rad);
        secante = 1 / cosseno;
        cossecante = 1 / seno;
        cotangente = 1 / tangente;

        System.out.print("Seno: " + String.format("%.4f", seno) + "\nCosseno: " + String.format("%.4f", cosseno) + "\nTangente: " + String.format("%.4f", tangente) + "\nSecante: " + String.format("%.4f", secante) + "\nCossecante: " + String.format("%.4f", cossecante) + "\nCotangente: " + String.format("%.4f", cotangente));
    }
}