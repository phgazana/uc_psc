import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {

        CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();

        condicionadorDeAr.ligar();
        JOptionPane.showMessageDialog(null, condicionadorDeAr.imprimirTemperatura());

        }
    }
