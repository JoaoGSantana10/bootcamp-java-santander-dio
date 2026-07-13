package Modulo01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){

        // Estrutura de Repetição for

        var sc = new Scanner(System.in);

        for (var i = 0 ; i <= 10; i++){

            if (i % 2 == 0){
                System.out.println(i);
            }
        //System.out.println(i);

        }

        /*
        Outra forma

        for (;;){
            System.out.println("Digite um nome: ");
            var nome = sc.next();

            if (nome.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println(nome);
        }

         */


    }
}
