import javax.swing.JOptionPane;

public class TesteCarros {
    public static void main(String[] args) {

        Carros carro1 = new Carros("Fusca", "Azul");
        Carros carro2 = new Carros("Gol", "Preto");

        JOptionPane.showMessageDialog(null, "Modelo: " + carro1.getModelo() + "\nCor: " + carro1.getCor() + "\nModelo: " + carro2.getModelo() + "\nCor: " + carro2.getCor());
    }
}
