package Modulo01;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado de um quadrado: ");
        var lado = sc.nextInt();
        var area = lado * lado;
        System.out.printf("A aréa do quadrado é: %s", area);


    }
}
