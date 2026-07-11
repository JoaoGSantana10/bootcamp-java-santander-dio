package Modulo01;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        /*
        Operadores Aritméticos

        + (Soma)
        - (Subtração)
        / (Divisão)
        % (Resto da divisão)
        * (Multiplicação)
        ( (), *, /, +, - ) (Ordem de precedência)
        ++ (Incremento)
        -- (Decremento)
        -------------------------------------------
        Classes para Funções

        Math.sqrt (Raiz Quadrada)
        Math.pow (Potência)

        */
        var sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var N1 = sc.nextFloat();
        System.out.println("Informe o segundo número: ");
        var N2 = sc.nextFloat();
        var soma = N1 + N2;
        var sub = N1 - N2;
        var div = N1 / N2;
        var restDiv = N1 % N2;
        var mult = N1 * N2;
        // N1 = N1 + 7;  ou N1 += 7;
        // (Somando 7 a variável N1, a segunda forma é mais resumida e serve para qualquer operador)
        System.out.println("-----------------------------------------------------------");
        System.out.println("            Operações com Operadores Aritméticos");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("A soma dos valores %s + %s = %s \n", N1,N2,soma);
        System.out.printf("A subtração dos valores %s - %s = %s \n", N1,N2,sub);
        System.out.printf("A divisão dos valores %s  %s = %s \n", N1,N2,div);
        System.out.printf("O resto da divisão entre %s %% %s = %s \n", N1,N2, restDiv);
        System.out.printf("A multiplicação dos valores %s * %s = %s \n", N1,N2,mult);
        System.out.println("-----------------------------------------------------------");
        System.out.println("                Classes de algumas Funções");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("A raiz quadrada do valor %s =  %s \n", N1,Math.sqrt(N1));
        System.out.printf("A potência do valor %s =  %s \n", N1,Math.pow(N1,3));
        System.out.printf("O valor %s Incrementado = %s \n", N1,++N1);
        System.out.printf("O valor %s Decrementado = %s", N1,--N1);


    }
}
