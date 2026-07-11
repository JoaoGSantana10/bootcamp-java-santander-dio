package Modulo01;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        // Operadores de Atribuição e Lógicos
        /*
        = (Atribuição)
        == (Comparação)
        != (Diferente)
        > (Maior)
        >= (Maior Igual)
        < (Menor)
        <= (Menor Igual)
        || (Ou)
         */
        /*
        var sc = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var result = sc.nextInt();
        var t = result != 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", !t);
        */
        System.out.println("Quantos anos você tem?");
        var sc = new Scanner(System.in);
        var age = sc.nextInt();
        System.out.println("Você é emancipado");
        var resp = sc.nextBoolean();
        var d = age >= 18 || (resp == true && age >= 16);
        System.out.printf("Você tem idade para dirigir? (%s)", d);


    }
}
