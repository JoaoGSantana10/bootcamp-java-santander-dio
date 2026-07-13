package Modulo01;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){

        // Estruturas de repetições while e do while

        var sc = new Scanner(System.in);
        var nome = "";

        do {
            System.out.println("Informe um nome");
            nome = sc.next();
            System.out.println(nome);
           /* if (nome.equalsIgnoreCase("exit")){
                break;
            }
            */
        } while (!nome.equalsIgnoreCase("exit"));


        /*

          Outras formas

        while (true){
            System.out.println("Informe um nome: ");
            nome = sc.next();
            System.out.println(nome);

            if (nome.equalsIgnoreCase("exit")){
                break;
            }
        }

         */

        /*
        while (!nome.equalsIgnoreCase("exit")){
            System.out.println("Informe um nome: ");
            nome = sc.next();
            System.out.println(nome);
        }

         */

    }
}
