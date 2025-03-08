public class TiposVariaveis {
    public static void main(String []args){
        byte idade  = 123;
        short ano = 2025;
        int cep = 12345678;
        long cpf = 12345678910L;
        float pi = 3.14f;
        double salario = 1000.00;
        boolean verdade = true;
        char letra = 'a';
        String nome = "Lucas";
        /*
         * A analíse abaixo é uma demonstração sobre a relação de tipos que devem ser bem definidos 
         * para que não ocorra perda de dados, ou seja, a conversão de um tipo maior para um tipo menor
         * pode acarretar em perda de dados, por isso é necessário fazer a conversão de forma explicita.
         */
        short numeroCurto = 1;
        int numeroNormal  = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        /*Variaveis constantes são valores aplicados a memória que não muda ou não podem ser mudados
         representando esses valores ultiliza-se "final" */
         final double valor_de_pi = 3.14;
    }
}
