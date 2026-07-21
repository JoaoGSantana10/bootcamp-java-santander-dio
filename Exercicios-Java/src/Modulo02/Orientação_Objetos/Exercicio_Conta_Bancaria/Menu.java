package Modulo02.Orientação_Objetos.Exercicio_Conta_Bancaria;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Qual o valor do depósito inicial: ");
        var depositoInicial = sc.nextDouble();
        var conta = new ContaBancaria(depositoInicial);
        var option = -1;

        do {
            System.out.println("------------------------------");
            System.out.println("         CONTA BANCÁRIA       ");
            System.out.println("------------------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma das opções acima: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    var saldo = conta.consultarSaldo();
                    System.out.println("O seu saldo é de : " + saldo + " R$");
                }
                case 2 -> {
                    var consultarChequeEspecial = conta.consultarChequeEspecial();
                    System.out.println("O seu cheque especial é de: " + consultarChequeEspecial + " R$");
                }
                case 3 -> {
                    System.out.println("Quando você quer depositar: ");
                    var quantidadeDeposito = sc.nextDouble();
                    var depositoDeuCerto = conta.depositar(quantidadeDeposito);
                    System.out.println(depositoDeuCerto ? "Depósito realizado com sucesso!"
                            : "Falha ao realizar depóstito!");
                }
                case 4 -> {
                    System.out.println("Quanto você deseja sacar: ");
                    var sacar = sc.nextDouble();
                    var saque = conta.sacar(sacar);
                    System.out.println(saque ? "Tentativa de saque concluída com sucesso!"
                            : "A tentativa de saque falhou!");
                }
                case 5 -> {
                    System.out.println("Quanto você deseja pagar do boleto: ");
                    var pagarBoleto = sc.nextDouble();
                    var pagouBoleto = conta.pagarBoleto(pagarBoleto);
                    System.out.println(pagouBoleto ? "Boleto pago com sucesso!" : "Falha ao pagar boleto!");
                }
                case 6 -> {
                    System.out.println(conta.estaUsandoChequeEspecial() ? "Você está usando o cheque especial"
                            : "você não está usando o cheque especial");

                }
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (true);


    }
}
