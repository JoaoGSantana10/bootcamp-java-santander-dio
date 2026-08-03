package Modulo03.Interfaces.Exercicio_Interfaces.Fórmula_Geométrica;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int option = -1;
        do {
           System.out.println("Escolha a forma geométrica que você deseja calcular a área:");
           System.out.println("1 - Quadrado \n2 - Retângulo \n3 - Círculo \n4 - Sair do Programa");
           System.out.println("Selecione uma opção: ");
           option = sc.nextInt();
           switch (option){
               case 1 -> {
                    System.out.println("A área do Quadrado é: " + createSquare().getArea());
               }
               case 2 -> {
                    System.out.println("A área do Retâgulo é: " + createRectangle().getArea());
               }
               case 3 -> {
                   System.out.println("A área do Círculo é: " + createCircle().getArea());
               }
               case 4 -> {
                    System.out.println("Saindo...");
               }
               default -> {
                   System.out.println("Número Inválido");
               }
           }
        } while (option != 4);

        /*
        Rectangle  rectangle = new Rectangle(10, 2);
        Square square = new Square(10);
        Circle circle = new Circle(10);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
        System.out.println(circle.getArea());

         */

    }

    private static GeometricForm createSquare(){
        System.out.println("Informe os tamanhos dos lados do Quadrado: ");
        var side = sc.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe o tamanho da base do Retângulo");
        var base = sc.nextDouble();
        System.out.println("Informe o tamanho da altura do Retângulo");
        var height = sc.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio do Círculo: ");
        var radius = sc.nextDouble();
        return new Circle(radius);
    }

}
