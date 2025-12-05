import javax.swing.JOptionPane;

public class Solucao21 {
    public static void main(String[] args) {

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
