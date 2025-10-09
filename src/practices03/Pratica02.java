import javax.swing.JOptionPane;

public class Pratica03_2 {
    public static void main(String[] args){

        int i = 2;

        while(i <= 200){
            JOptionPane.showMessageDialog(null,"Números pares: " + i);
            i = i + 2;
        }
    }
}
