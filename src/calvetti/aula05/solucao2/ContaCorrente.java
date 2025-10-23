public class ContaCorrente {

    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;


    public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) {

        this.numero = numero;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldo;
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

    public void setNumero(int numero) {
        if(numero >= 0 && numero <= 9999) {
            this.numero = numero;
        }
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

    public String ImprimirSaldo() {
        return "\nConta Corrente: " + numero + " Digito: " + digito + "\nAgencia: " + agencia.getNumero() + " Digito: " + agencia.getDigito() + "\nSaldo Inicial: " + saldo;

    }
}


