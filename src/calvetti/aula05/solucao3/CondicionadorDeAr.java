public class CondicionadorDeAr {

    private Termostato termostato;
    private boolean ligado;


    public CondicionadorDeAr() {

        Termostato termostato = new Termostato();
        this.ligado = false;
    }
    public boolean getligado(){ return ligado; }

    public Termostato getTermostato (){ return termostato; }

    public void ligar() { this.ligado = true;}

    public void desligar() { this.ligado = false;}

    public void aumentarTemperatura() {

        if (termostato.getTemperatura() < 28 && ligado) {
            termostato.setTemperatura(+1);
        }
    }
    public void reduzirTemperatura() {

        if (termostato.getTemperatura() < 15 && ligado) {
            termostato.setTemperatura(-1);
        }
    }

    public int imprimirTemperatura() {

        return termostato.getTemperatura();
    }
}





