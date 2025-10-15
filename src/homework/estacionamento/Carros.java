public class Carros {
    private String modelo;
    private String cor;

    public Carros(String modelo, String cor){

        this.modelo = modelo;
        this.modelo = cor;
    }

    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
}
