public class Usuario {
    public static void main(String[] args) {

        CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();

        condicionadorDeAr.ligar();
        for (int i = 0; i < 10; i++) {
            condicionadorDeAr.aumentarTemperatura();
        }
        System.out.println(condicionadorDeAr.imprimirTemperatura());

        for (int i = 0; i < 18; i++) {
            condicionadorDeAr.reduzirTemperatura();
        }
        System.out.println(condicionadorDeAr.imprimirTemperatura());

        for (int i = 0; i < 10; i++) {
            condicionadorDeAr.aumentarTemperatura();
        }
        System.out.println(condicionadorDeAr.imprimirTemperatura());
    }
}

