import javax.swing.JOptionPane;

public class Exercicio07{
    public static void main(String[] args){

        String i1, a1, m1, d1;
        int a2, m2, d2, resultado;



        i1 = JOptionPane.showInputDialog("Digite sua idade expressa em anos/meses/dias");
        a1 = i1.substring(0, 2);
        m1 = i1.substring(4, 5);
        d1 = i1.substring(6, 8);

         a2 = Integer.parseInt(a1);
         m2 = Integer.parseInt(m1);
         d2 = Integer.parseInt(d1);

            resultado = a2 * 365 + m2 * 30 + d2;


        JOptionPane.showMessageDialog(null, "Aproximadamente " + resultado + " dias vividos.");

    }
}