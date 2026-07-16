package Modulo01;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        // Lê a linha de entrada e separa em nome e tipo de conta
        //System.out.println("Digite seu nome: ");
        String input = sc.nextLine();
        //System.out.println("Informe seu tipo de conta (corrente / poupanca / investimento): ");
        String[] partes = input.split(" ");

        String nome = partes[0];
        String TipoConta = partes[1];

        // para fazer comparação de strings
        if (TipoConta.equalsIgnoreCase("corrente")){
            System.out.printf("Bem-Vindo(a), %s! Sua conta %s está pronta para uso.", nome, TipoConta);
        } else if (TipoConta.equalsIgnoreCase("poupanca")) {
            System.out.printf("Bem-Vindo(a), %s! Sua conta %s está pronta para uso.", nome, TipoConta);
        } else if (TipoConta.equalsIgnoreCase("investimento")) {
            System.out.printf("Bem-Vindo(a), %s! Sua conta %s está pronta para uso.", nome, TipoConta);
        } else {
            System.out.println("Tipo de conta inválida");
        }

    }
}
