import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {

        Termostato termostato = new Termostato();
        CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();

        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura:"));
        termostato.setTemperatura(temperatura);

        if (temperatura == 30 || temperatura == 20) {

            JOptionPane.showMessageDialog(null, "Erro");
        } else {
            JOptionPane.showMessageDialog(null, termostato.getTemperatura());
        }
    }
}
