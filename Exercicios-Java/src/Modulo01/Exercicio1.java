package Modulo01;

import java.util.Scanner;

public class Exercicio1 {

    //private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args){

        // Declarações de Variáveis

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome: ");
        String name = sc.next();
        System.out.println("Informe sua idade: " );
        int age = sc.nextInt();
        System.out.println("Olá " + name + ", você tem " + age + " anos");

        /* Outra forma
        System.out.printf("Olá %s sua idade é %s \n ", name, age);

         Outra forma sem quebra de linha
        System.out.print("Olá, informe o seu nome: \n");

        */


        /* Podemos usar "var" ou o próprio nome String ou int

        var sc = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        var name = sc.next();
        System.out.println("Informe sua idade: " );
        var age = sc.nextInt();
        System.out.println("Olá " + name + ", sua idade é " + age + " anos");

        */
    }
}
