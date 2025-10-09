import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto:"));

        Produto produto = new Produto(nome, preco, quantidade);

        String msg = "Nome: " + produto.getNome() + "\nPreco: " + produto.getPreco() + "\nQuantidade: " + produto.getQuantidade() + "\nTotal: " + produto.calcularTotal();

        JOptionPane.showMessageDialog(null, msg);
    }
}
