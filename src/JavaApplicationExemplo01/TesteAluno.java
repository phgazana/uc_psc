public class TesteAluno {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno();//Objeto criado
        alu1.setRa(100);
        alu1.mostraRa();
        alu1.setNome("Maria da Silva");
        alu1.mostraNome();

        Aluno alu2 = new Aluno();

        alu2.setRa(200);
        alu2.mostraRa();
        alu2.setNome("Yasmim da Costa");
        alu2.mostraNome();
    }
}
       /* int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
        JOptionPane.showMessageDialog(null, "RA: " + ra);*/



