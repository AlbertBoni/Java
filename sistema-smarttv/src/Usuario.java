public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);

        for (int i = 0; i < 14; i++)
            smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);


        smartTV.proximoCanal();
        smartTV.proximoCanal();
        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.definirCanal(12);
        System.out.println("Canal atual: " + smartTV.canal);
    }
}