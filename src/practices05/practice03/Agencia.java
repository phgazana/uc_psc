public class Agencia {

    private int numero;
    private int digito;

    public Agencia(int numero, int digito) {

        if (numero > 0 && numero <= 9999) {
            this.numero = numero;
        } else {
            System.out.println("Digite até quatro digitos");
        }
        this.digito = digito;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public String getDados() {
        return "\nAgencia: " + numero + " Digito: " + digito;
    }
}
