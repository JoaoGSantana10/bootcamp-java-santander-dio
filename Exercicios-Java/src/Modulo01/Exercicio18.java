package Modulo01;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var N1 = sc.nextInt();
        var verifica = true;
        while (verifica){
            System.out.println("Informe um número maior que o primeiro: ");
            var N = sc.nextInt();
            if (N < N1){
                System.out.printf("Número menor que %s\n", N1);
                continue;
            }
            var result = N % N1;
            verifica = result == 0;
            System.out.printf("%s %% %s = %s\n", N, N1, result);



            /* if (N % N1 != 0){
                System.out.println("Resto da divisão igual a 0!");
            } else {
                System.out.println("Resto da divisão diferente de 0!");
                break;
            }

             */
        }
    }
}
