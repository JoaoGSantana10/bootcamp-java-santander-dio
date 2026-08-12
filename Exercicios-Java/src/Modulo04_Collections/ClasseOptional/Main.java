package Modulo04_Collections.ClasseOptional;

import java.util.Optional;

public class Main {

    public static void main(String[] args){
        // User user = null;
        // Optional foi bom para tratar o erro de NullPointer
        // Optional<User> optional = Optional.empty(); // Optional vazio
        Optional<User> optional = Optional.of(new User("João", 20, SexEnum.MALE)); // Para criar e definir
        // os valores para fazer importação estática do Enum basta mover para outro package
        // o .ofNullable permite trabalhar com valores null
        // optional.ifPresent(System.out::println);
        // System.out.println(optional.isEmpty()); // Verifica se está vazio
        // System.out.println(optional.isPresent()); // Verifica se não está vazio
        /* int newAge = 21;
        optional.ifPresentOrElse(
                user -> {
                    System.out.printf("Usuário: %s", user);
                    user = new User("João", newAge, SexEnum.MALE);
                    System.out.printf("Usuário: %s", user);
                },
                () -> System.out.println("Não foi informado um usuário")
        );
         */
        /*
        System.out.println(optional.orElse(new User("Lucas", 18, SexEnum.MALE))); // Verifica o optional
        // se ele estiver vazio retorna o optional que está definido nele
        System.out.println(optional.orElseThrow()); // Dispara uma Exception se o optional for vazio
        System.out.println(optional.orElse(defaultUser())); // Não usa Lambda apenas se o optional for vazio usa só
        // quando você tem um valor fixo para retornar. Ele executa o defaultUser
        System.out.println(optional.orElseGet(Main::defaultUser)); // Usa Lambda apenas se o optional for vazio e faz
        // uma busca do valor default. Não executa o defaultUser por causa do Lambda

         */


        // faz o mapeamento não importando de está null ou não no momento
        Optional<UserV2> newUser = optional.map(user -> new UserV2(user.name(), user.age(), user.sex()));
        System.out.println(newUser.orElseThrow());

    }


    public static User defaultUser(){
        System.out.println("Buscando valor default: ");
        return new User("Maria", 20, SexEnum.FEMALE);
    }


}
