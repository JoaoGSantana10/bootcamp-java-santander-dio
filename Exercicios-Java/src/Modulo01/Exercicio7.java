package Modulo01;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        var Ano = OffsetDateTime.now().getYear();
        System.out.println("Digite o seu nome: ");
        var nome =  sc.next();
        System.out.println("Digite seu ano de nascimento: ");
        var AnoNasc = sc.nextInt();
        var idade = Ano - AnoNasc;
        System.out.println("Olá, " + nome + " você tem " + idade + " anos");


    }
}
