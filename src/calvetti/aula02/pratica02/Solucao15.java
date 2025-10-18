public class Solucao15 {
    public static void main(String[] args) {

        /*15) Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade
        da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.*/

        int anoNascimento = 2006;

        int anoAtual = 2025;

        if (anoNascimento < 1925 || anoNascimento > 2025) {
            System.out.println("Ano inválido");
        } else {
            System.out.println(anoAtual - anoNascimento);
        }
    }
}
