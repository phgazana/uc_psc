import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {

       String nome = JOptionPane.showInputDialog("Insira o nome do produto:");
       double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto:"));
       int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));

       Produto produto = new Produto(nome, preco, quantidade);

       produto.setPreco(preco * quantidade);
       JOptionPane.showMessageDialog(null, produto.getDados());

    }
}
