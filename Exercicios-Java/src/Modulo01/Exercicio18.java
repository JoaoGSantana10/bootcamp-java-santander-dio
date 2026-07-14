package Modulo01;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var N1 = sc.nextInt();
        while (true){
            System.out.println("Informe um número maior que o primeiro: ");
            var N = sc.nextInt();
            if (N < N1){
                System.out.println("Número menor que o primeiro, ele será ignorado!");
                continue;
            }
            if (N % N1 != 0){
                System.out.println("Resto da divisão igual a 0, deu certo!");
            } else {
                System.out.println("Resto da divisão diferente de 0!");
                break;
            }
        }
    }
}
