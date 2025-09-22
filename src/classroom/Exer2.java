import javax.swing.*;

public class Exer2 {
    public static void main(String[] args) {
        String cadastroSenha;
        String confirmaSenha;
        double a;
        double b;
        int i = 0;

        cadastroSenha = JOptionPane.showInputDialog(null, "Senha", "", JOptionPane.QUESTION_MESSAGE);

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro número", "", JOptionPane.QUESTION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo  número", "", JOptionPane.QUESTION_MESSAGE));

        while(i < 3) {
            confirmaSenha = JOptionPane.showInputDialog(null, "Digite sua senha", "", JOptionPane.QUESTION_MESSAGE);

            if (confirmaSenha.equals(cadastroSenha)) {
                System.out.println(a / b);

            } else {
                System.out.println("Senha incorreta");
                i = i + 1;
            }
        }
        System.exit(0);
    }

}