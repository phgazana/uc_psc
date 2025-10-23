import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {

        Agencia agencia = new Agencia("Nubank", 7890, 5);
        ContaCorrente conta = new ContaCorrente(1234, 4, agencia, 150);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);


        JOptionPane.showMessageDialog(null, "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + conta.ImprimirSaldo());

        conta.sacar(140);

        JOptionPane.showMessageDialog(null, conta.getSaldo());

        conta.sacar(200);

        JOptionPane.showMessageDialog(null, conta.getSaldo());

        conta.depositar(25.45);

        JOptionPane.showMessageDialog(null, "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + conta.ImprimirSaldo());
    }
}
