import javax.swing.JOptionPane;

public class Pratica02_1 {
    public static void main(String[] args){

        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        if(n1 + n2 > n3 && n2 + n3 > n1 && n1 + n3 > n2){
            JOptionPane.showMessageDialog(null, "Podem ser lado de um triângulo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não podem ser lados de um triângulo");
        }
    }

}
