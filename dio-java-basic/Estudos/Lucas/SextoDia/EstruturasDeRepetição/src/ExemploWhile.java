import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 100.0;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
                System.out.println("Joaozinho gastou toda sua mesada em doce");
                System.out.println("Saldo da mesada: "+ mesada);
                break;
            }
            System.out.println("Doce do valor "+ valorDoce +" adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Saldo da mesada: "+ mesada);
        }
    }
    public static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
        