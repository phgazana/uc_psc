import javax.swing.JOptionPane;

public class Solucao21 {
    public static void main(String[] args) {

        /*21) Entrar com o nome, idade e sexo de 20 pessoas. Imprimir o nome sempre que a
pessoa for do sexo masculino e tiver mais de 21 anos.*/

        String nome, sexo;
        int idade;
        int i = 0;

        do {
            nome = JOptionPane.showInputDialog("Insira o nome:");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade:"));
            sexo = JOptionPane.showInputDialog("Insira o sexo");

            if ((sexo.equalsIgnoreCase("MASCULINO") || sexo.equalsIgnoreCase("M")) && idade > 21) {
                JOptionPane.showMessageDialog(null, nome);
            }
            i++;
        } while (i < 20);
    }
}
