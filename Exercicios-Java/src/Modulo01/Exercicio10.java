package Modulo01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome1 = sc.next();
        System.out.println("Digite outro nome: ");
        var nome2 = sc.next();
        System.out.printf("Informe sua idade %s: ", nome1);
        var idade1 = sc.nextInt();
        System.out.printf("Informe sua idade %s: ", nome2);
        var idade2 = sc.nextInt();
        var DifIdade = idade1 - idade2;
        System.out.printf("A diferença da idade do %s e do %s é: %s", nome1, nome2, DifIdade);




    }
}
