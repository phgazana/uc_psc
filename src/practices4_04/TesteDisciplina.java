import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome:");
        String professor = JOptionPane.showInputDialog("Professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre:"));
        String ofertada = JOptionPane.showInputDialog("Ofertada:");

        Disciplina disciplina = new Disciplina(nome, professor, semestre);

        if (ofertada.equalsIgnoreCase("SIM") || ofertada.equalsIgnoreCase("S")) {
            disciplina.setOfertada(true);
        } else {
            disciplina.setOfertada(false);
        }
        String msg = "Nome: " + disciplina.getNome() + "\nProfessor: " + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre() + "\nOfertada: " + (disciplina.getOfertada() ? "Sim" : "Nao");

        JOptionPane.showMessageDialog(null, msg);
    }
}
