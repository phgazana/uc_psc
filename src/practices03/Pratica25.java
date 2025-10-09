import javax.swing.JOptionPane;

public class Pratica03_25 {
    public static void main(String[] args) {

        int votos;
        double totalVotos;
        double v1 = 0, v2 = 0, v3 = 0, v4 = 0;
        double vt1, vt2, vt3, vt4;


        do {
            votos = Integer.parseInt(JOptionPane.showInputDialog("1.Candidato \n2.Candidato \n3.Candidato \n4.Candidato \n-1 Sair"));

            switch (votos) {
                case 1:
                    v1++;
                    break;
                case 2:
                    v2++;
                    break;
                case 3:
                    v3++;
                    break;
                case 4:
                    v4++;
                    break;
                case -1:
                    break;
            }

        } while (votos != -1);

        totalVotos = v1 + v2 + v3 + v4;

        vt1 = (v1 / totalVotos) * 100;
        vt2 = (v2 / totalVotos) * 100;
        vt3 = (v3 / totalVotos) * 100;
        vt4 = (v4 / totalVotos) * 100;

        JOptionPane.showMessageDialog(null, "Percentual de Votos: \n1.Candidato: " + vt1 + "%" + "\n2.Candidato: " + vt2 + "%" + "\n3.Canditato: " + vt3 + "%" + "\n4.Canditato: " + vt4 + "%");
        JOptionPane.showMessageDialog(null, "Total de Votos: " + totalVotos);

    }
}

