public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private double preco;

    public Livro(String titulo, String autor, int ano, double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo");
        }
    }
    public void getMostrarDados(){
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Ano: " + ano + " | Preço: " + preco);
    }
}
