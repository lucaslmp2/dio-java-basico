package DecimaDia;
import java.util.Scanner;
public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();
        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double entrada = 0.0;
        for(int i=1;i<4;i++){
            entrada = scanner.nextDouble();
            saldoInicial+=entrada;
        }
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial;
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}

