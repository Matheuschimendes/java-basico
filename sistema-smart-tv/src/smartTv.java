public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCarnal(){
        canal++;
    }
    public void diminuirCarnal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true; 
    }
    public void Desligar(){
        ligada = false; 
    }
}
