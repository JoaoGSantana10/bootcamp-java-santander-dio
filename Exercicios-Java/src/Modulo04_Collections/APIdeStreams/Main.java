package Modulo04_Collections.APIdeStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Modulo04_Collections.APIdeStreams.ContactType.EMAIL;
import static Modulo04_Collections.APIdeStreams.ContactType.PHONE;
import static Modulo04_Collections.APIdeStreams.Sex.FEMALE;
import static Modulo04_Collections.APIdeStreams.Sex.MALE;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>(generateUsers());

        //users.sort(Comparator.comparing(User::name, Comparator.reverseOrder())); // Ordenação por nome mas pode ser
        // feito por idade e o .reverseOrder é em ordem decrescente se tirar ele fica em ordem crescente
        var values = users.stream().filter(u -> u.contacts().size() >= 2)
                // (u -> u.contacts() != null && u.contacts().isEmpty()) Verifica os contatos que estão vazios
                // (u -> u.contacts() == null || u.contacts().isEmpty()) Verifica os contatos nulos ou vazios
                // (u -> u.contacts().stream().anyMatch(c ->  c.type() == EMAIL) Verifica e mostra os contatos que tem EMAIL e
                // que tem telefone também
                // (u -> u.contacts().stream().allMatch(c ->  c.type() == EMAIL) Verifica apenas se o contato tem email e para
                // o telefone só fazer a mesma coisa só que trocando "EMAIL" por "PHONE"
                .toList();

        values.forEach(System.out::println);

        var values1 = users.stream()
                .flatMap(u -> u.contacts().stream()) // Pega todos os contatos
                .filter(c -> c.type() == PHONE) // Pega somento os contatos que tem telefone
                .map(c -> String.format("{\n 'Description': %s,\n 'type': %s \n}", c.description(), c.type()))
                // .sorted((Comparator.comparing(Contact::description)) // Faz a ordenação dos contatos
                .toList();
        values1.forEach(System.out::println);


        var values2 = users.stream()
                .flatMap(u -> u.contacts().stream()) // Pega todos os contatos
                .filter(c -> c.type() == PHONE) // Pega somento os contatos que tem telefone
                .map(c -> c.description().replace("(", "")
                        .replace(")", "")
                        .replace("-", ""))
                .mapToLong(Long::parseLong)
                .min();
        System.out.println(values2);
    }


    private static List<User> generateUsers() {
        var contacts1 = List.of(
                new Contact("(61) 99249-7111", PHONE),
                new Contact("joaogsantanadeoliveira@gmail.com", EMAIL)
        );

        var contacts2 = List.of(
                new Contact("(61) 99871-2145", PHONE)
                // new Contact("lucas@gmail.com", EMAIL)
        );

        var contacts3 = List.of(
                // new Contact("(61) 99023-3423", PHONE),
                new Contact("pedro@gmail.com", EMAIL)
        );

        var contacts4 = List.of(
                // new Contact("(61) 99213-4343", PHONE),
                new Contact("marcos@gmail.com", EMAIL),
                new Contact("marcos2@gmail.com", EMAIL)
        );

        var contacts5 = List.of(
                new Contact("(61) 99233-4323", PHONE),
                new Contact("(61) 99243-4323", PHONE)
                // new Contact("maria@gmail.com", EMAIL)
        );


        var user1 = new User("João", 20, MALE, new ArrayList<>(contacts1));
        var user2 = new User("Lucas", 18, MALE, new ArrayList<>(contacts2));
        var user3 = new User("Pedro", 17, MALE, new ArrayList<>(contacts3));
        var user4 = new User("Marcos", 29, MALE, new ArrayList<>(contacts4));
        var user5 = new User("Maria", 21, FEMALE, new ArrayList<>(contacts5));
        var user6 = new User("Ana", 25, FEMALE, new ArrayList<>());


        return List.of(user1, user2, user3, user4, user5);
    }
}


