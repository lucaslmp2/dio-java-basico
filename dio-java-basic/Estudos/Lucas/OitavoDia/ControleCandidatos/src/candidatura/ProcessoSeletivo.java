package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecionarCandidato();
    }
    static void selecionarCandidato(){
        String [] candidatos = {"João","Maria", "José", "Ântonio", "Joaquim", "Francisco", "Gabriel", "Lucas", "Douglas", "Carla", "Joana", "Juliana", "Josefina", "Bianca"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
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
