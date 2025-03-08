import java.util.Date;

public class Operadores {

    public static void main(String[] args) {
        /*
        Operadores são símbolos que possuem características próprias de acordo com
        o seu uso em determinadas situações ou operações.
        */
        /*operador de atribuição ( = ) */
        int a = 10;
        String nome ="Lucas";
        double peso = 89.5;
        boolean verdade = true;
        char sexo = 'M';
        Date dataNascimento = new Date();
        /*operadores aritméticos */
        /* um ponto a ser considerado é quando o operador "+"
         é ultilizado com strings para concatenação o que o torna um operador de atribuição */
        double soma = 10 + 5;
        int subtração = 10 - 5;
        int multiplicação = 10 * 5;
        int divisão = 10 / 5;
        int modulo = 10 % 5;
        double resultado = (10*7) + (20/3);
        /*Operadores Unarios */
        /*
        muito ultilizados em incrementação "++" "--" "+" "-" "!"
        */
        int numero = 10;
        
        System.out.println(- numero);
        System.out.println(numero);
        System.out.println(-- numero);
        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(numero);
        System.out.println(+ numero);
        System.out.println(numero);
        /*neste exemplo a varável que era true na declaração foi negada com o operador "!"
         * mas a forma verdadeira de se fazer seria declarar uma atribuição com o operador de negação
         * "verdade = !verdade;"
        */
        System.out.println(!verdade);
        /*Operador de ternário subistitui bem uma condicional de tomada de decisão*/

        int b;
        a = 5;
        b = 6;
        String resultadoBooleano = a==b ? "verdadeiro" : "falso";
        System.out.println(resultadoBooleano);

        /*Operador relacional "==" "!=" "> ou <" ">= ou <=" ultilizados para comparação em algumas operações*/

        resultadoBooleano = a != b ? "verdadeiro" : "falso";
        System.out.println(resultadoBooleano);

        resultadoBooleano = a > b ? "verdadeiro" : "falso";
        System.out.println(resultadoBooleano);

        resultadoBooleano = a < b ? "verdadeiro" : "falso";
        System.out.println(resultadoBooleano);

        resultadoBooleano = a >= b ? "verdadeiro" : "falso";
        System.out.println(resultadoBooleano);

        resultadoBooleano = a <= b ? "verdadeiro" : "falso";
        System.out.println(resultadoBooleano);

        String nome1 = "Lucas";
        String nome2 = new String("Lucas");

        System.out.println(nome1.equals(nome2));/*demonstração de ultilização de .equals para comparar 
        o conteúdo entre dois objetos para verificar se são iguais*/

        /*Operadores lógicos "&&" "||" ultilizados para comparação de valores booleanos*/
        boolean condição1 = true;
        boolean condição2 = true;

        if(condição1 && condição2){
            System.out.println("Ambas as condições são verdadeiras");
        }else if(condição1 || condição2){
            System.out.println("Uma das condições é verdadeira");
        }else{
            System.out.println("Ambas as condições não são verdadeiras");
        }
        /* mesmo que no lugar de uma variavel booleana seja ultilizada uma expressão comparativa
         por está analizando operações lógicas booleanas o retorno será true ou false o que não anula a condicional*/
    }
}