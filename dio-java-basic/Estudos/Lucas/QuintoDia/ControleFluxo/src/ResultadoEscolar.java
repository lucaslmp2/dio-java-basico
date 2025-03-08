public class ResultadoEscolar {
    /*Avaliando estruturas condicionais e ultilizando debug para acompanhamento de breankingpoints */
    public static void main(String[] args) {
        int nota = 6;
        /*Condição Ternária */
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        
        if(nota >= 7){
            System.out.println("Aprovado!");

        }else if(nota >= 5 && nota < 7){/*Demonstrando condicional encadeada */
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
