public class Jogo {
    public static void main(String[] args) throws InterruptedException {

        Personagem cacador = new Personagem();
        Personagem soneca = new Personagem();

        soneca.nome = "Soneca";
        cacador.nome = "Ruan";

        while (true) {
            cacador.cacar();
            soneca.dormir();
            cacador.comer();
            soneca.dormir();
            cacador.dormir();
            soneca.dormir();
            cacador.cacar();
            soneca.comer();
            cacador.cacar();
            soneca.cacar();
            System.out.println("===================");
            Thread.sleep(3000);
        }
    }
}
