package Modulo01;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        // Estrutura Condicional switch case

        var sc = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        var num = sc.nextInt();
        var msg = switch (num) {
            case 1, 7 -> {
                var dia = num == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana!", dia);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            //case 7 -> "Sábado";
            default -> "Número digitado inválido!";
        };
        System.out.println(msg);

            /*

            Outras formas

            case 1, 7 -> System.out.println("Fim de semana");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            //case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número digitado inválido!");

             */

            /*

            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            //case 7:
                //System.out.println("Sábado");
            default:
            System.out.println("Número digitado inválido!");

             */


    }
}
