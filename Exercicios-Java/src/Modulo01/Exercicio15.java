package Modulo01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 10: ");
        var num = sc.nextInt();
        System.out.printf("TABUADA DO NÚMERO: %s\n", num);
        for (var i = 0; i <= 10; i++){
            var tabuada = num * i;
         System.out.printf("%s x %s = %s\n", num, i, tabuada);
        }





    }
}
