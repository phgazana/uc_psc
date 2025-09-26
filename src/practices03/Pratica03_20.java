import javax.swing.JOptionPane;

public class Pratica03_20 {
    public static void main(String[] args) {

        int limite, incremento;

        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o número limite:"));
        incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));

        for (int i = 0; i <= limite; i += incremento) {

            JOptionPane.showMessageDialog(null, i);
        }
    }
}

