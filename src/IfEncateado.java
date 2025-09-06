import javax.swing.JOptionPane;

public class IfEncateado {
    public static void main(String[] args){
        //Criação de váriaveis
        double nota;

        //Carregando valores
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite nota:"));

        //Avaliando condição
        if(nota>=90){
            JOptionPane.showMessageDialog(null,"Parabèns");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        else if(nota>=80){
            JOptionPane.showMessageDialog(null, "Conceito B");
        }
        else if (nota>=50) {
            JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
