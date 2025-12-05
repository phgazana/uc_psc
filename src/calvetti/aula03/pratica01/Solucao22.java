import javax.swing.JOptionPane;

public class Solucao22 {
    public static void main(String[] args) {

        int limite;

        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o número limite:"));

        for (int i = 1; i < limite; i++) {

            if(i % 2 != 0){
                JOptionPane.showMessageDialog(null,i);
            }
        }


        }
    }
