import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Conta Corrente:"));
        int digitoConta = Integer.parseInt(JOptionPane.showInputDialog("Digito:"));
        int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Agencia:"));
        int digitoAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digito:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo Inicial:"));

        Cliente cliente = new Cliente(nome, cpf);
        Agencia agencia = new Agencia(numeroAgencia, digitoAgencia);
        ContaCorrente conta = new ContaCorrente(cliente, numeroConta, digitoConta, agencia, saldo);

        JOptionPane.showMessageDialog(null, conta.getDados());
    }
}
