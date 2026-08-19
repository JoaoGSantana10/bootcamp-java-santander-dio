package Modulo05.Exceptions.dao;

import Modulo05.Exceptions.Model.MenuOption;
import Modulo05.Exceptions.Model.UserModel;
import Modulo05.Exceptions.exception.CustomException;
import Modulo05.Exceptions.exception.EmptyStorageException;
import Modulo05.Exceptions.exception.UserNotFoundException;
import Modulo05.Exceptions.exception.ValidatorException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Modulo05.Exceptions.validator.UserValidator.verifyModel;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Bem-Vindo ao cadastro de usuários, seleciona a operação desejada:");
            System.out.println("1 - Cadastrar \n2 - Atualizar  \n3 - Excluir \n4 - Buscar por identificador " +
                    "\n5 - Listar usuários cadastrados \n6 - Sair ");
            var userInput = sc.nextInt();
            var selectedOption = MenuOption.values()[userInput - 1];
            switch (selectedOption) {
                case SAVE -> {
                    try {
                        var user = dao.save(requestToSave());
                        System.out.printf("O usuário %s foi cadastrado!\n", user);
                    } catch (CustomException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                case UPDATE -> {
                    try {
                        var user = dao.update(requestToUpdate());
                        System.out.printf("O usuário %s foi atualizado!\n", user);
                    } catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    } catch (CustomException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    } finally {
                        System.out.println("=============================");
                    }
                 }
                case DELETE -> {
                    try {
                        dao.delete(requestId());
                        System.out.println("Usuário foi excluído do sistema!");
                    } catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("====================");
                    }
                }
                case FIND_BY_ID -> {
                    try { // Faz uma tentativa de tudo que está no bloco try
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.printf("Usuários com id: %s\n", id);
                        System.out.println(user);
                    } catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("==============================");
                    }
                }
                case LIST_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados no sistema:\n");
                    users.forEach(System.out::println);
                }
                case EXIT ->{
                    System.exit(0);
                    System.out.println("Saindo...");
                }
            }

        }

    }

    private static long requestId(){
        System.out.println("Informe o identificador do usuário: ");
        return sc.nextLong();
    }

    private static UserModel requestToSave() throws CustomException {
        System.out.println("Informe o nome do usuário: ");
        var name = sc.next();
        System.out.println("Informe o e-mail do usuário: ");
        var email = sc.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthdayString = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        return validateInputs(0, name, email, birthday);
    }

    private static UserModel validateInputs(final long id, final String name,
                                            final String email, final LocalDate birthday) throws CustomException {
        var user = new UserModel(0, name, email, birthday);
        try {
            verifyModel(user);
            return user;
        }catch (ValidatorException ex){
            throw new CustomException("O seu usuário contém erros: " + ex.getMessage(), ex);
        }
    }

    private static UserModel requestToUpdate() throws CustomException {
        System.out.println("Informe o identificador do usuário: ");
        var id = sc.nextLong();
        System.out.println("Informe o nome do usuário: ");
        var name = sc.next();
        System.out.println("Informe o e-mail do usuário: ");
        var email = sc.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthdayString = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        return validateInputs(id, name, email, birthday);
    }

}
