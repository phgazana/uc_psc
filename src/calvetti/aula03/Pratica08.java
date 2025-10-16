import javax.swing.JOptionPane;

public class Pratica03_8 {
    public static void main(String[] args) {

        int num = 120, i = 1;

        while (num <= 300) {

            i = i * num;
            num++;
        }
        JOptionPane.showMessageDialog(null, i);
    }
}
