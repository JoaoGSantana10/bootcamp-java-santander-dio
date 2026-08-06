package Modulo04_Collections.Classe_BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

        var value1 = new BigDecimal("2.1");
        var value2 = new BigDecimal("7.2");
        System.out.println(value2.divide(value1, 3, RoundingMode.HALF_UP)); // Para fazer divisão usa o divide
        System.out.println(value2.negate()); // Para negar um número usa negate
        System.out.println(value2.multiply(value1)); // Para multiplicação em BigDecimal se usa multiply
        System.out.println(value2.sqrt(new MathContext(2))); // Para fazer a raiz quadrada usa sqrt
        // e usa a classe MathContext
        System.out.println(value2.pow(2)); // Para fazer a potência de um número usa pow



        /*
        System.out.println(value1.add( value2)); // Para soma em BigDecimal se usa add

        // Para subtração em BigDecimal se usa subtract
        System.out.println(new BigDecimal("2.00").subtract(  new BigDecimal("1.1")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.2")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.3")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.4")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.5")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.6")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.7")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.8")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.9")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("2")));
         */

    }
}
