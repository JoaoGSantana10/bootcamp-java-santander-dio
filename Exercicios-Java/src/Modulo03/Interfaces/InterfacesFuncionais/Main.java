package Modulo03.Interfaces.InterfacesFuncionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){


        List<User> users = List.of(new User("João", 20), new User("Pedro", 21),
                new User("Lucas", 17), new User("Maria",25));
        /*

        Simplificando Expressões

        var consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        };
        users.forEach(Consumer)

        Expressões Lambda Simplificadas

        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        });



        users.forEach((User user) -> {
            System.out.println(user);
        });



        users.forEach(user -> {
            System.out.println(user);
        });

        users.forEach(System.out::println);

         */

        printStringValores(User::nome, users);
        printStringValores(user -> String.valueOf(user.age()), users);
        printStringValores(Record::toString, users); // imprime tudo, nome e idade




    }

    private static void printStringValores(Function<User, String > callback, List<User> users){
        users.forEach(user -> System.out.println(callback.apply(user)));
    }

}
