import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        int i;
        String add;
        String remove;

        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        do {
            i = Integer.parseInt(JOptionPane.showInputDialog("""
                    1) Insira uma nota\
                    
                    2)Remova uma nota\
                    
                    3)Altere uma nota\
                    
                    4)Listar todas as notas\
                    
                    5) Saia do sistema"""));
            if (i == 1) {
                add = JOptionPane.showInputDialog("Adicionar:");
                blocoDeNotas.add(add);
            } else if (i == 2) {
                remove = JOptionPane.showInputDialog("Remover:");
                blocoDeNotas.remove(remove);
            } else if (i == 3) {

            } else if (i == 4) {
                blocoDeNotas.list();
            }
        } while (i != 5);
    }
}
