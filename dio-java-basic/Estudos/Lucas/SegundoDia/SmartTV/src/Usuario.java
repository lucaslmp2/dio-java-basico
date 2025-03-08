public class Usuario {
    public static void main(String[] args) throws Exception {
        /*
        *Com a execução dos metodos ficou mais claro o entendimento sobre deixar claro 
        * o que cada metodo faz, e o que cada metodo retorna, e o que cada metodo recebe como parametro.
        */
        SmartTv tv = new SmartTv();
        tv.ligar();
        System.out.println("Novo status Tv Ligada:"+tv.ligada);
        System.out.println("Canal atual: "+tv.canal);
        System.out.println("Volume atual: "+tv.volume);
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.println("Novo volume: "+tv.volume);
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        System.out.println("Novo canal: "+tv.canal);
        tv.mudarCanal(22);
        System.out.println("Novo canal: "+tv.canal);
        tv.desligar();
        System.out.println("Tv Ligada: "+tv.ligada);
    }
}