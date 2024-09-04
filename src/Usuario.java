public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);
    
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: "+ smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);
    
    }
    
}
