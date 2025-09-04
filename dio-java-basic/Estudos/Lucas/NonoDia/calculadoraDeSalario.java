package NonoDia;

import java.util.Scanner;

public class calculadoraDeSalario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double [] salarioBruto = new double[5];
        String [] funcionarios = {"Pedro","José", "Maria", "João", "Bryan"};
        double [] adicionalBeneficios = new double[5];
        double [] percentualDeImposto = new double [5];
        double [] salario = new double [5];
            for(int sb = 0;sb<funcionarios.length;sb++){
                System.out.println("--------------------------Next-------------------------");
                System.out.println("Digite o salário bruto de: "+funcionarios[sb]);
                System.out.println("-------------------------------------------------------");
                salarioBruto[sb] = leitor.nextDouble();
                System.out.println("-------------------------------------------------------");
                System.out.println("Digite o adicional dos benefícios: "+funcionarios[sb]);
                System.out.println("-------------------------------------------------------");
                adicionalBeneficios[sb] = leitor.nextDouble();
                System.out.println("-------------------------------------------------------");
                percentualDeImposto[sb] = calculoDeImposto(salarioBruto[sb]);
                salario[sb] = percentualDeImposto[sb] + adicionalBeneficios[sb];
                System.out.printf("O salário de "+(funcionarios[sb])+" é: R$%.2f\n",salario[sb]);
                System.out.println("-------------------------------------------------------");
            }
        }
    static double calculoDeImposto(double salarioBruto){
        if(salarioBruto<=1100.0){
            salarioBruto = salarioBruto - (salarioBruto * 0.05);
        }else if(salarioBruto>1100.01 && salarioBruto<=2500.0){
            salarioBruto = salarioBruto - (salarioBruto * 0.10);
        }else if (salarioBruto>2500.0) {
            salarioBruto = salarioBruto - (salarioBruto * 0.15);
        }
        return salarioBruto;
    }
}
