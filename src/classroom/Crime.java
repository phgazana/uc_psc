import javax.swing.JOptionPane;

public class Crime {
    public static void main(String[] args){

        int contadorSim, contadorNao = 0;
        String p1, p2, p3, p4, p5;



        p1 = JOptionPane.showInputDialog("Telefonou para a vítima?");
        p1 = p1.toUpperCase();

        p2 = JOptionPane.showInputDialog("Esteve no local do crime?");
        p2 = p2.toUpperCase();

        p3 = JOptionPane.showInputDialog("Mora perto da vitima?");
        p3 = p3.toUpperCase();

        p4 = JOptionPane.showInputDialog("Devia para a vítima?");
        p4 = p4.toUpperCase();

        p5 = JOptionPane.showInputDialog("Já trabalhou com a vítima?");
        p5 = p5.toUpperCase();

        if (p1.equals("SIM")) {

        } else if (p1.equals("NAO") || p1.equals("NÃO")) {
            contadorNao++;
        }


    }

}

