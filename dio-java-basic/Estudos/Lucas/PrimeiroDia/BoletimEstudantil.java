<<<<<<<< HEAD:dio-java-basic/Estudos/Lucas/PrimeiroDia/src/java/main/BoletimEstudantil.java

========
package Edu.Lucas.PrimeiroDia;
>>>>>>>> 59ef0a100371ca8d74afa25fa0efedca0308c875:dio-java-basic/src/main/java/Edu/Lucas/PrimeiroDia/BoletimEstudantil.java
/*
    A demonstração desta aula teve como base
    demonstrar a identação como argumento para
    uma boa visualização e consequetemente 
    uma boa interpretação de um código
*/
/*
    A aula também abrangiu sobre a imortância de
    criar pacotes ou subdiretórios para uma melhor
    organização e contemplar boas práticas abordadas
    ou práticas comuns ultilizadas por diferentes organizações
*/
public class BoletimEstudantil {
   public static void main(String[] args) {
    
    /*int mediaFinal  = 6;
    if(mediaFinal<6){
    System.out.println("Reprovado");
    }
    else if(mediaFinal==6){
    System.out.println("Prova Final");
    }
    else{
    System.out.println("Aprovado");
    }
    */
        int mediaFinal  = 6;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal==6)
            System.out.println("Prova Final");
        else
            System.out.println("Aprovado");  
    } 
}