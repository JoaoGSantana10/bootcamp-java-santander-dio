package Modulo01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){

        // Estrutura Condicional if, else e else if

        var sc = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var nome = sc.next();
        System.out.println("Informe sua idade:");
        var idade = sc.nextInt();
        System.out.printf("%s, você é emancipado? (s/n): \n",nome);
        var emancipado = sc.next().equalsIgnoreCase("s");

        /*
        Outras forma de fazer as verificações

        var dirigir = idade >= 18 || (idade >= 16 && emancipado); nesse caso chama a variável dirigir no if.

        if ( idade >= 18 || (idade >= 16 && emancipado); outra forma de fazer a verificação.

        var msg = ""; dessa forma você cria uma variável para armazenar uma informação e para usar é so fazer
        msg = name + "você pode dirigir!"; depois é so chamar essa variável
        System.out.println(msg);

        você pode também fazer nesse formato:
        dessa forma você está fazendo uma atribuição e vericando se é verdade ou não que aquela pessoa pode dirigir.

        var dirigir = idade >= 18 || (idade >= 16 && emancipado);
        var msg = dirigir ?
                name + "você pode dirigir!":
                name + "você não pode dirigir";
                System.out.println(msg);

         */

        if (idade >= 18){
            System.out.printf("Bem vindo, %s!\n", nome);
            System.out.printf("%s, você tem %s anos e pode dirigir!\n", nome, idade);
        } else if (idade >= 16 && emancipado){
            System.out.printf("%s, apesar de ter %s anos, você é emancipado e pode dirigir!\n", nome, idade);
        } else {
            System.out.printf("%s, você tem %s anos e não pode dirigir ainda!\n", nome, idade);
        }
        System.out.println("Fim da execução!");

    }
}
