public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + "" + smartTv.ligada);
        System.out.println("Canal Atual ?" + "" + smartTv.canal);
        System.out.println("Volume Atual ?" + "" + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.aumetarCanal();
        System.out.println("Canal Atual ?" + smartTv.canal);

        smartTv.desligar();
        System.out.println("Tv Desliga " + smartTv.ligada);
    }
}
