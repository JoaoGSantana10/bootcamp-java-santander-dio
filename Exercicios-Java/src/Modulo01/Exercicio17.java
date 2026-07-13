package Modulo01;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        //System.out.println("Informe um número: ");
        //var N1 = sc.nextInt();
        //System.out.println("Informe um segundo número maior que o primeiro: ");
        //var N2 = sc.nextInt();
        //if (N1 > N2){
          //  System.out.println("Número Inválido");
        //}
        var op = 0;
        do {

            System.out.println("Informe um número: ");
            var N1 = sc.nextInt();
            System.out.println("Informe um segundo número maior que o primeiro: ");
            var N2 = sc.nextInt();
            if (N1 > N2){
                System.out.println("Número Inválido");
                continue;
            }
            System.out.println("Escolha uma função entre (1 = ímpar / 2 = par / 0 = sair): ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    for (var i = N2; i >= N1; i--) {
                        if (i % 2 != 0) {
                            System.out.printf("Número ímpares decrescente no intervalo: %s\n", i);
                        }
                    }
                    break;
                case 2:
                    for (var i = N2; i >= N1; i--) {
                        if (i % 2 == 0) {
                            System.out.printf("Número pares decrescente no intervalo: %s\n", i);
                        }
                    }
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Número informado inválido");
            }
        } while (op != 0);


    }
}
