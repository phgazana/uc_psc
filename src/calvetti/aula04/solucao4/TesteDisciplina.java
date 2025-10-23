import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Insira o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Insira o nome do professor");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Insira o semestre:"));
        boolean ofertada = false;
        String perguntaOfertada = JOptionPane.showInputDialog("Insira se está ofertada:").toUpperCase();
        if (perguntaOfertada.equals("SIM"))
            ofertada = true;

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        JOptionPane.showMessageDialog(null, disciplina.getDados());
    }
}
