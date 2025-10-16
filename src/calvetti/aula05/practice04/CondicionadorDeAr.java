public class CondicionadorDeAr {

    private Termostato termostato;
    private boolean ligado;


    public CondicionadorDeAr() {

        this.ligado = false;
    }

    public void Ligar() {

        ligado = true;
    }

    public void Desligar() {
        ligado = false;
    }

    public void aumentarTemperatura(Termostato temperatura) {

        if (temperatura.getTemperatura() <= 28 && ligado == true) {
            termostato.setTemperatura(termostato.getTemperatura() + 1);
        }
    }

    public void reduzirTemperatura(Termostato temperatura) {

        if (temperatura.getTemperatura() <= 15 && ligado == true) {
            termostato.setTemperatura(termostato.getTemperatura() - 1);
        }
    }

    public Termostato getImprimirTemperatura() {
        return termostato;
    }
}





