public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumetarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumetarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

}
