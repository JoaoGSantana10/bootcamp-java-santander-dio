package Modulo04_Collections.ExerciciosCollections.ExCalculadora;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args){

    var sc = new Scanner(System.in);
    System.out.println("Informe o número da operação que deseja realizar (1 - SUM / 2 - SUBTRACTION): ");
        var operationOption = sc.nextInt();
    while (operationOption > 2 || operationOption < 1){
        System.out.println("Operação Inválida! Digite um número válido para realizar a operação (1 - SUM / 2 - SUBTRACTION): ");
        operationOption = sc.nextInt();
    }
    var selectedOperation = Operation.values()[operationOption - 1];
    System.out.println("Informe os número que serão usados separadamente por vírgulas (ex.: 1, 2, 3, ...");
    var numbers = sc.next();
    var numberArray = Arrays.stream(numbers.split(","))
            .mapToLong(Long::parseLong).
            toArray();

    var result = selectedOperation.getOperationCallback().exex(numberArray);
    var operationToSho = numbers.replaceAll(",", " " + selectedOperation.getSignal() + " ");
    System.out.println("O resultado da opereção escolhida " + operationToSho + " é = : " + result);




    }
}
