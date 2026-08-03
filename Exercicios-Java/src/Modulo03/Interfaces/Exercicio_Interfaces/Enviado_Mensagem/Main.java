package Modulo03.Interfaces.Exercicio_Interfaces.Enviado_Mensagem;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        var option = -1;

        do {
            System.out.println("Escolha uma forma de enviar a mensagem:");
            System.out.println("1 - SMS \n2 - E-mail \n3 - Redes Sociais \n4 - WhatsApp \n5 - Sair do Programa ");
            System.out.println("Escolha a opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1 -> {
                      mensagemSMS();
                      System.out.println("Mensagem enviada!");

                }
                case 2 -> {
                      mensagemEmail();
                      System.out.println("Mensagem enviada!");
                }
                case 3 -> {
                      mensagemRedesSociais();
                      System.out.println("Mensagem enviada!");
                }
                case 4 -> {
                      mensagemWhatsApp();
                      System.out.println("Mensagem enviada!");
                }
                case 5 -> {
                    System.out.println("Saindo...");
                }
                default -> {
                    System.out.println("Número Inválido");
                }

            }


        }while (option != 5);

    }

    private static ServicoMensagem mensagemSMS(){
        System.out.println("Digite a mensagem: ");
        var mensagem = sc.nextLine();
        var sms = new SMS();
        sms.enviarMensagem(mensagem);
        return sms;
    }

    private static ServicoMensagem mensagemEmail(){
        System.out.println("Digite a mensagem: ");
        var mensagem = sc.nextLine();
        System.out.println("Mensagem enviada!");
        var email = new Email();
        email.enviarMensagem(mensagem);
        return email;
    }

    private static ServicoMensagem mensagemRedesSociais(){
        System.out.println("Digite a mensagem: ");
        var mensagem = sc.nextLine();
        var redesSociais = new RedeSocial();
        redesSociais.enviarMensagem(mensagem);
        return redesSociais;
    }

    private static ServicoMensagem mensagemWhatsApp(){
        System.out.println("Digite a mensagem: ");
        var mensagem = sc.nextLine();
        var whatsApp = new WhatsApp();
        whatsApp.enviarMensagem(mensagem);
        return whatsApp;
    }
}
