public class CondicionadorDeAr {

    private Termostato termostato;
    private boolean ligado;


    public CondicionadorDeAr() {

        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean getligado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void aumentarTemperatura() {

        if (termostato.getTemperatura() < 28 && this.ligado) {
            termostato.setTemperatura(termostato.getTemperatura() + 1);
        }
    }

    public void reduzirTemperatura() {

        if (termostato.getTemperatura() < 15 && this.ligado) {
            termostato.setTemperatura(termostato.getTemperatura() - 1);
        }
    }

    public int imprimirTemperatura() {

        return this.ligado ? termostato.getTemperatura() : 0;
    }
}






