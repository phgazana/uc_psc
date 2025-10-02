import javax.swing.JOptionPane;

public class Senha {
    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog("Digite a senha:");

        if (senha.equals("1234")) {
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        } else {
            JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
        }
    }
}
