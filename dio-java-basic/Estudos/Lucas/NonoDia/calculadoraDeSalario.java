package NonoDia;

import java.util.Scanner;

public class calculadoraDeSalario {
    public static void main(String[] args) {
        adicionarDados(null, null);
    }
    static float adicionarDados(float [] salarioBruto, float [] adicionalBeneficios){
        Scanner leitor = new Scanner(System.in);
        salarioBruto = new float[5];
        String [] funcionarios = {"Pedro","José", "Maria", "João", "Bryan"};
        adicionalBeneficios = new float[5];
        float [] percentualDeImposto = new float [5];
        float [] salario = new float [5];
        for(int sb = 0;sb<funcionarios.length;sb++){
            System.out.println("\\____________________________________________________________/");
            System.out.println("                          Inserir Salário                      ");
            System.out.println("|\\__________________________________________________________/|");
            System.out.println("Digite o salário bruto de: "+funcionarios[sb]);
            System.out.println("_______________________________________________________________");
            salarioBruto[sb] = leitor.nextFloat();
            System.out.println("_______________________________________________________________");
            System.out.println("Digite o adicional dos benefícios: "+funcionarios[sb]);
            System.out.println("_______________________________________________________________");
            adicionalBeneficios[sb] = leitor.nextFloat();
            System.out.println("_______________________________________________________________");
            percentualDeImposto[sb] = calculoDeImposto(salarioBruto[sb]);
            salario[sb] = percentualDeImposto[sb] + adicionalBeneficios[sb];
            System.out.printf("                  O salário de "+(funcionarios[sb])+" é: R$%.2f\n",salario[sb]);
            System.out.println("|\\__________________________________________________________/|");
        }
        leitor.close();
        return adicionarDados(salarioBruto, adicionalBeneficios);
        
    }
    static float calculoDeImposto(float salarioBruto){
        if(salarioBruto <= 1100.0){
            salarioBruto = (float) (salarioBruto - (salarioBruto * 0.05));
        }else if(salarioBruto > 1100.01 && salarioBruto <= 2500.0){
            salarioBruto = (float) (salarioBruto - (salarioBruto * 0.10));
        }else if (salarioBruto > 2500.0) {
            salarioBruto = (float) (salarioBruto - (salarioBruto * 0.15));
        }
        return salarioBruto;
    }
}
