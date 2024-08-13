package Exececoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExececao {

    public static void main(String[] args) throws ParseException {
//        try {
//            Number valor = Double.valueOf("a1.75");
//
//            System.out.println(valor);

            Number valor = NumberFormat.getNumberInstance().parse("a1.75");

            System.out.println(valor);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Erro ao converter número");
//        }
    }
}
