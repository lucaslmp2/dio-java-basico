<<<<<<<< HEAD:dio-java-basic/Estudos/Lucas/PrimeiroDia/src/java/main/MinhaClasse.java

========
package Edu.Lucas.PrimeiroDia;
>>>>>>>> 59ef0a100371ca8d74afa25fa0efedca0308c875:dio-java-basic/src/main/java/Edu/Lucas/PrimeiroDia/MinhaClasse.java
/*Uma pequena introdução sobre métodos e execução do mesmo*/
public class MinhaClasse {

    public static void main (String[] args) {

        final String primeiroNome = "Lucas";
        final String nomeDoMeio = "Moreira";
        final String ultimoNome = "Pachêco";

        String nomeCompleto = nomeCompleto(primeiroNome, nomeDoMeio, ultimoNome);

        System.out.println(nomeCompleto);


    }
    public static String nomeCompleto(String primeiroNome, String nomeDoMeio, String ultimoNome) {
        return primeiroNome.concat("  ").concat(nomeDoMeio).concat("  ").concat(ultimoNome);
    }
}
