import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Locale;

public class BlocoDeNotas {

    private ArrayList<String> notas;

    public BlocoDeNotas() {
        notas = new ArrayList<>();
    }

    public void add(String adicionar) {
        notas.add(adicionar.toUpperCase());
    }

    public void remove(String remover) {

        notas.remove(remover.toUpperCase());
    }
    public void alterar(int indice, String novaNota){
        notas.set(indice, novaNota.toUpperCase());
    }

    public void list() {
        JOptionPane.showMessageDialog(null, notas);
    }
}
