package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"João","Maria", "José", "Ântonio", "Joaquim"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("Conseguimos contato com o candidato "+candidato+" na "+tentativasRealizadas+"° tentativa.");
        }else{
            System.out.println("Não conseguimos contato com o candidato "+candidato+", numero máximo de tentativas alcançado.");
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"João","Maria", "José", "Ântonio", "Joaquim"};
        System.out.println("Candidatos Selecionados:");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("o candidato de número: "+(indice+1)+ " é: " + candidatos[indice]+"\n");
        }
        System.out.println("Forma abreviada de imprimir os candidatos usando for each:");
        for(String candidato : candidatos){
            System.out.println("Candidato selecionado foi: " + candidato);
        }
    }
    static void selecionarCandidato(){
        String [] candidatos = {"João","Maria", "José", "Ântonio", "Joaquim", "Francisco", "Gabriel", "Lucas", "Douglas", "Carla", "Joana", "Juliana", "Josefina", "Bianca"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;   
            }
            candidatosAtual++;
        } 
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIgar para candidato com contra proposta.");
        }else{
            System.out.println("Aguardando resultado dos outros candidatos.");
        }
    }

}