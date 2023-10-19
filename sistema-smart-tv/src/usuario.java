public class usuario {
   public static void main(String[] args){

    smartTv smartTv = new smartTv();
    

    System.out.println("TV Ligada? " + smartTv.ligada);
    System.out.println("Canal Atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.Desligar();
    System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

    smartTv.ligar();
    System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();

    System.out.println("Volume Atual da TV " + smartTv.volume);

    smartTv.mudarCanal(8);
    System.out.println("Canal atual: " + smartTv.canal);
   }
}
