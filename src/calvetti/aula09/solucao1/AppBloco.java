import javax.swing.JOptionPane;

public class AppBloco {
    public static void main(String[] args) {

        int entrada;
        String add;
        String remove;
        int alterar;
        String novaNota;

        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(

                            "1) Insira uma nota\n"
                            + "2) Remova uma nota\n"
                            + "3) Altere uma nota\n"
                            + "4) Listar todas as notas\n"
                            + "5) Saia do sistema"));

            if (entrada == 1) {
                add = JOptionPane.showInputDialog("Adicionar:");
                blocoDeNotas.add(add);
            } else if (entrada == 2) {
                remove = JOptionPane.showInputDialog("Remover:");
                blocoDeNotas.remove(remove);
            } else if (entrada == 3) {
                alterar = Integer.parseInt(JOptionPane.showInputDialog("Indice: "));
                novaNota = JOptionPane.showInputDialog("Adicionar: ");
                blocoDeNotas.alterar(alterar, novaNota);
            } else if (entrada == 4) {
                blocoDeNotas.list();
            }
        } while (entrada != 5);
    }
}
