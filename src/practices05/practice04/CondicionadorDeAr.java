public class CondicionadorDeAr {

    private Termostato termostato;
    private boolean ligado;


    public CondicionadorDeAr() {

        this.termostato = null;
        this.ligado = false;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigar() {

        ligado = true;
    }

    public void setDesliga() {
        ligado = false;
    }

    public void setAumentarTemperatura() {

        if ( ) {

        }
    }

    public void setReduzirTemperatura() {

        if (temperatura <= 15) {
            temperatura--;
        }
    }

    public Termostato getImprimirTemperatura() {
        return temperatura;
    }
}





