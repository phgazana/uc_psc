import javax.swing.JOptionPane;

public class TesteCarros {
    public static void main(String[] args) {

        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        String cor = JOptionPane.showInputDialog("Digite a cor do carro:");

        Carros carro1 = new Carros(modelo, cor);

        JOptionPane.showMessageDialog(null, carro1.getModelo() + carro1.getCor());
    }
}
