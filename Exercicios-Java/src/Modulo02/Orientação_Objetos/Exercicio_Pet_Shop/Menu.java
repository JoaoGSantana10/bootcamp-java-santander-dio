package Modulo02.Orientação_Objetos.Exercicio_Pet_Shop;

import java.util.Scanner;

public class Menu {

      private final static Scanner sc = new Scanner(System.in);
      private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args){

        sc.useDelimiter("\\n");
        var op = -1;
        do {
            System.out.println("------------------------------------");
            System.out.println("Bem-Vindo ao PETSHOP");
            System.out.println("------------------------------------");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Dar banho no pet ");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verificar o shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar márquina");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            op = sc.nextInt();
            switch (op){
                case 1 -> petMachine.banhoNoPet();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verifyAgua();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removerPet();
                case 9 -> petMachine.limpMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }

        } while (true);
    }

    private static void setAgua(){
        System.out.println("Tentando colocar água na máquina");
        petMachine.addAgua();

    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina ");
        petMachine.addShampoo();
    }

    private static void verifyAgua() {
        var amout = petMachine.getAgua();
        System.out.println("A máquina no momento com " + amout + " litros(s) de água");
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A máquina no momento com " + amout + " litros(s) de shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine(){
        var nome = "";
        while (nome == null || nome.isEmpty()){
            System.out.println("Informe o nome do pet: ");
            nome = sc.next();
        }
        var pet = new Pet(nome);
        petMachine.setPet(pet);
    }

    /*
    pode ser desse jeito também utilizando
    public void getPetFromMachine(){
        petMachine.removerPet();
    }

     */
}
