package Modulo01;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base para se calculado a aréa de um retângulo: ");
        var base = sc.nextFloat();
        System.out.println("Agora digite a altura: ");
        var altura = sc.nextFloat();
        var area = base * altura;
        System.out.printf("A área do retângulo é: %s", area);

    }

}
