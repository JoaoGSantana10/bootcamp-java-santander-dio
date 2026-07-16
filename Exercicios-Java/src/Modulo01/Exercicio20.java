package Modulo01;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        // Lendo os valores de saldo e valor da transação
        System.out.println("Digite o valor do seu saldo disponível: ");
        int SaldoDisp = sc.nextInt();
        System.out.println("Digite o valor da transação: ");
        int ValorT = sc.nextInt();

        if (SaldoDisp >= ValorT){
            System.out.println("Transação aprovada");
        } else {
            System.out.println("Saldo insuficiente");
        }




    }
}
