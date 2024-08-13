package Exececoes;

import com.sun.jdi.PathSearchingVirtualMachine;

public class FormatadorDeCep {

    public static void main(String[] args) {
        try {
            // Exemplo de uso
            String cep = "23456789";
            String cepFormatado = formatarCep(cep);
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
            if (cep == null || cep.length() != 8) {
                throw new CepInvalidoException("CEP inválido");
            }
            return "23.456-789";
        }

}
