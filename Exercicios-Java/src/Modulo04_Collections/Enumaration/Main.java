package Modulo04_Collections.Enumaration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        var option = -1;
        while (option !=5){
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Sair");
            option = sc.nextInt();
            if (option > 5 || option < 1){
                System.out.println("Selecione uma opção válida");
                continue;
            }

            if (option == 5){
                System.out.println("Saindo...");
                break;
            }

            var selectedOption = OperationEnum.values()[option - 1]; // Obtendo a operação pelo índice outra forma
            // seria pegar por valuesOf que seria pela String definida no Enum
            System.out.println("Informe o primeiro valor: ");
            var value1 = sc.nextInt();
            System.out.println("Informe o segundo valor: ");
            var value2 = sc.nextInt();

            var result = selectedOption.getCalculate().apply(value1, value2); // o apply passa os valores
            System.out.printf("%s %s %s = %s \n", value1, selectedOption.getSymbol(), value2, result);
            //System.out.println(selectedOption);
        }




    }
}
