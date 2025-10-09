public class ContaCorrente {

    private Cliente cliente;
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;


    public ContaCorrente(Cliente cliente, int numero, int digito, Agencia agencia, double saldo) {

        this.cliente = cliente;
        if (numero > 0 && numero <= 9999) {
            this.numero = numero;
        } else {
            System.out.println("Digite até quatro digitos");
        }
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente. Saque não efetuado.");
            return 0;

        }
    }

    public double consultarSaldo() {

        return saldo;
    }

    public String getDados() {
        return cliente.getDados() + "\nConta Corrente: " + numero + " Digito: " + digito + agencia.getDados() + "\nSaldo Inicial: " + saldo;

    }
}


