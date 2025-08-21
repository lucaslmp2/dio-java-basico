package SetimoDia;

public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("45590000");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O Cep é invalido!!!");
        }
    } 
    static String formatarCep(String cep) throws CepInvalidoException{
    if (cep.length() != 8) 
        throw new CepInvalidoException();
        return "45.590-000";
    }
}

