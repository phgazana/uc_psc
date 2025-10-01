import javax.swing.JOptionPane;

public class Aluno {
    //Atributos
    private int ra;
    private String nome;

    //Metodos
    public void setRa(int r) {
        JOptionPane.showMessageDialog(null, "Passou setRa r = " + r);
        this.ra = r;
    }

    public void mostraRa() {
        JOptionPane.showMessageDialog(null, "Oi ra = " + this.ra);
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void mostraNome() {
        JOptionPane.showMessageDialog(null, "Nome = " + this.nome);
    }

}
