public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Qual o canal atual? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.irCanal(50);
        System.out.println("Qual o canal atual? " + smartTv.canal);
    }
}
