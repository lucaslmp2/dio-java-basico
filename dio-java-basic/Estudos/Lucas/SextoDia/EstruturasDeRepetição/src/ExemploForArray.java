public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"João", "Maria", "José", "Ana", "Pedro"};
        for(int x = 0;alunos.length > x; x++){
            System.out.println("O aluno no indíce x = " + x + " é " + alunos[x]);
        }
        //outra forma de percorrer o array for / each
        for(String aluno : alunos){
            System.out.println("O aluno é " + aluno);
        }
    }
}
