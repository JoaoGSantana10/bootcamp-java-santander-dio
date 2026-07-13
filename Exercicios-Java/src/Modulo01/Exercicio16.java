package Modulo01;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        System.out.println("Informe seu peso em (KG): ");
        var peso = sc.nextFloat();
        System.out.println("Informe sua altura em (Metros): ");
        var altura = sc.nextFloat();
        var imc = peso / (altura * altura);
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }


    }
}
