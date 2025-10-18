public class Solucao7 {
    public static void main(String[] args) {

        /*7) Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino
e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário,
imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)*/

        String nome = "Paulo";
        char sexo = 'M';
        int idade = 18;
        sexo = Character.toUpperCase(sexo);

        if (sexo == 'F' && idade < 25) {
            System.out.println(nome + " ACEITA");
        } else {
            System.out.println(nome + " NÃO ACEITA");
        }


    }
}
