public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void proximoCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal++;
    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;
    }

}
