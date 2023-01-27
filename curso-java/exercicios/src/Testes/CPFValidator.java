package Testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPFValidator {

    private static final Pattern CPF_PATTERN = Pattern.compile("^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$");

    public static boolean isValidCPF(String cpf) {
        if (cpf == null) {
            return false;
        }
        Matcher matcher = CPF_PATTERN.matcher(cpf);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] cpfs = { "123.456.789-01", "12345678901", "123.456.789-00", "123.456.789-012", "abc.def.ghi-jk" };
        for (String cpf : cpfs) {
            System.out.println(cpf + " is valid? " + isValidCPF(cpf));
        }
    }
}

