public class Solucao14 {
    public static void main(String[] args) {

        /*14) Crie um algoritmo para calcular a área de um círculo, com base no seu raio
(Área = PI * raio * raio, onde PI = 3.14159). Use variáveis reais;*/

        double raio = 50;

        double area = Math.PI * Math.pow(raio, 2);

        System.out.print("Área do circulo: " + area);
    }
}
