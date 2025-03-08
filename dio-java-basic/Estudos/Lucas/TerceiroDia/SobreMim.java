import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual é o seu nome?: ");
            String nome = scanner.nextLine();
            System.out.println("Qual é o seu sobrenome?: ");
            String sobrenome = scanner.nextLine();
            System.out.println("Qual é a sua idade?: ");
            int idade = scanner.nextInt();
            System.out.println("Qual é a sua altura?: ");
            float altura = scanner.nextFloat();
            System.out.println("Qual é o seu peso?: ");
            float peso = scanner.nextFloat();
            System.out.println("Olá, meu nome é " + nome + " " + sobrenome + ", tenho " + idade + " anos, minha altura é " + altura + "m e peso " + peso + "kg.");
            // Fechar o scanner para evitar vazamento de recursos
        }
    }
}
