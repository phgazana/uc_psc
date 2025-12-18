import javax.swing.JOptionPane;

public class Solucao11 {
    public static void main(String[] args) {

        /*11) Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos
medidores de consumo. Para cada consumidor são digitados os seguintes dados:
código do consumidor, quantidade de kWh consumidos durante o mês, tipo do
consumidor. Os tipos podem ser 1 - residencial, preço por kWh = R$ 0,3; 2 - comercial,
preço por kWh = 0,5; 3 - industrial, preço por kWh = 0,7. Os dados devem ser lidos até
que seja encontrado um consumidor com código 0 (zero). Calcular e imprimir o custo
total para cada consumidor, o total de consumo para os três tipos de consumidor, a
média de consumo dos tipos 1 e 2.*/

        String consumidor;
        int kWh;
        double residencial, comercial, industrial;
        double consumidorResidencial = 0, consumidorComercial = 0, consumidorIndustrial = 0, consumidorFinal = 0;
        double media;

        residencial = 0.3;
        comercial = 0.5;
        industrial = 0.7;

        do {
            consumidor = JOptionPane.showInputDialog("0 - Sair \n1- Residencial \n2- Comercial \n3- Industrial");

            if (consumidor.equals("0")) {
                break;
            } else if (consumidor.equals("1")) {
                kWh = Integer.parseInt(JOptionPane.showInputDialog("Quanto consumo(kWh):"));
                consumidorFinal = kWh * residencial;
                consumidorResidencial = consumidorFinal;
            } else if (consumidor.equals("2")) {
                kWh = Integer.parseInt(JOptionPane.showInputDialog("Quanto consumo(kWh):"));
                consumidorFinal = kWh * comercial;
                consumidorComercial = consumidorFinal;
            } else if (consumidor.equals("3")) {
                kWh = Integer.parseInt(JOptionPane.showInputDialog("Quanto consumo(kWh):"));
                consumidorFinal = kWh * industrial;
                consumidorIndustrial = consumidorFinal;
            }

            JOptionPane.showMessageDialog(null, "Valor: " + consumidorFinal);

        } while (true);

        if (consumidorResidencial + consumidorComercial > 0) {
            media = (consumidorResidencial + consumidorComercial) / 2;
        } else {
            media = 0;
        }

        JOptionPane.showMessageDialog(null, "Residencial: " + consumidorResidencial + "\nComercial: " + consumidorComercial + "\nIndustrial: " + consumidorIndustrial);
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
