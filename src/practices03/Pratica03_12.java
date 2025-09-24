import javax.swing.JOptionPane;

public class Pratica03_12 {
    public static void main(String[] args) {

        int idade;
        int menos = 0, mais = 0;

        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

            if (idade < 21 && idade > 0) {
                menos++;
            }
            if (idade > 50 && idade < 120) {
                mais++;
            }

            JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + menos + "\nTotal de pessoas com mais de 50 anos: " + mais);

        } while (idade > 0 && idade < 120);


    }
}
