package Modulo01;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){

        // ENTRADAS
        var sc = new Scanner(System.in);
        System.out.println("Informe o valor bruto do salário: ");
        var VBsalario = sc.nextFloat();
        System.out.println("Informe o valor dos benefícios: ");
        var Benef = sc.nextFloat();
        float ValorImposto = 0;
        float saida = 0;

        // percentual de imposto
        if (VBsalario >= 0 && VBsalario <= 1100.00){
            // Atribui a aliquota de 5% mediante o salário:
            ValorImposto = 0.05f * VBsalario;
            System.out.printf("O valor do salário com o imposto de 5%% é: %s\n", ValorImposto);
        } else if (VBsalario >= 1100.01 && VBsalario <= 2500.00) {
            // Atribui a aliquota de 10% mediante o salário:
            ValorImposto = 0.10f * VBsalario;
            System.out.printf("O valor do salário com o imposto de 10%% é: %s\n", ValorImposto);
        } else if (VBsalario > 2500.01) {
            // Atribui aliquota de 15% mediante o salário:
            ValorImposto = 0.15f * VBsalario;
            System.out.printf("O valor do salário com o imposto de 15%% é: %s\n", ValorImposto);
        }
        // Valor final do salário - percentual de imposto + benefícios
        saida = VBsalario - ValorImposto + Benef;
        // Formatado com duas casas decimais
        System.out.println("O valor final do seu salário é: " +  String.format("%.2f", saida));


    }
}
