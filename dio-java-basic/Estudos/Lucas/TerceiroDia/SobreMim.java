import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual é o seu nome?: ");
        String nome = ler.nextLine();
        System.out.println("Qual é o seu sobrenome?: ");
        String sobrenome = ler.nextLine();
        System.out.println("Qual é a sua idade?: ");
        int idade = ler.nextInt();
        System.out.println("Qual é a sua altura?: ");
        float altura = ler.nextFloat();
        System.out.println("Qual é o seu peso?: ");
        float peso = ler.nextFloat();
        System.out.println("Olá, meu nome é " + nome + " " + sobrenome + ", tenho " + idade + " anos, minha altura é " + altura + "m e peso " + peso + "kg.");
        ler.close();
    }
}