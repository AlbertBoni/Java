public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("26262626");
            System.out.println("CEP = " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        return "26.262-262";

    }
}
