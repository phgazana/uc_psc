import javax.swing.JOptionPane;

public class Crime {
    public static void main(String[] args) {

        String p1, p2, p3, p4, p5;
        int i = 0;

        p1 = JOptionPane.showInputDialog("Telefonou para a vitima?");
        p2 = JOptionPane.showInputDialog("Esteve no local do crime?");
        p3 = JOptionPane.showInputDialog("Mora perto da vitima?");
        p4 = JOptionPane.showInputDialog("Devia para a vitima?");
        p5 = JOptionPane.showInputDialog("Ja trabalhou com a vitima?");

        if (p1.equalsIgnoreCase("SIM") || p1.equalsIgnoreCase("S")) {
            i++;
        }
        if (p2.equalsIgnoreCase("SIM") || p2.equalsIgnoreCase("S")) {
            i++;
        }
        if (p3.equalsIgnoreCase("SIM") || p3.equalsIgnoreCase("S")) {
            i++;
        }
        if (p4.equalsIgnoreCase("SIM") || p4.equalsIgnoreCase("S")) {
            i++;
        }
        if (p5.equalsIgnoreCase("SIM") || p5.equalsIgnoreCase("S")) {
            i++;
        }
        if (i == 2) {
            JOptionPane.showMessageDialog(null, "Suspeita");
        } else if (i == 3 || i == 4) {
            JOptionPane.showMessageDialog(null, "Cumplice");
        } else if (i >= 5) {
            JOptionPane.showMessageDialog(null, "Assasino");
        } else {
            JOptionPane.showMessageDialog(null, "Inocente");
        }
    }

}

