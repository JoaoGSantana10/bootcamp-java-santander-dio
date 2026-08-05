package Modulo04_Collections.Map;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // List  Quando você quer trabalhar com listas
        // Set   Quando você quer trabalhar com seu dados sem importar a ordem e sem ficar duplicando
        Map<String, User> users = new HashMap<>();
        /*
        Map<String, User> users = new LinkedHashMap<>();  Trabalha com o conceito de lista ligada na hora que ele
        entrar vai ser uma ordem de inserção aonde ele sempre conhece seu próximo item

        Map<String, User> users = new TreeMap<>();  Funciona com a questão de árvore binária que você insere um item
         ele vai ver se o item for maior ele joga para um lado ou joga para um outro
         */
        users.put("joao@joao.com", new User("João", 20));
        users.put("lucas@lucas.com", new User("Lucas",22));
        users.put("pedro@pedro.com", new User("Pedro", 25));
        users.put("maria@maria.com", new User("Maria", 29));
        /*
        System.out.println(users);
        System.out.println("--------------------------------");
        users.keySet().forEach(System.out::println);
        System.out.println("--------------------------------");
        users.values().forEach(System.out::println);
        System.out.println(users.containsKey("joao@joao.com"));
        System.out.println(users.containsValue(new User("Lucas", 22)));
        System.out.println(users.remove("pedro@pedro.com", new User("Pedro",25)));
         */
        System.out.println(users.getOrDefault("lucas@lucas.com",new User(" ", -1)));
        System.out.println(users.get("joao@joao.com")); // Retorna o valor
        users.isEmpty(); // Verifica se o mapa está vazio
        users.merge("pedro@pedro.com", new User("", -1), (user, user2) -> {
           System.out.println(user);
           System.out.println(user2);
           return user2;
        });
        System.out.println(users);
        users.putIfAbsent("", new User(" ", -1)); // Adiciona uma chave ao mapa
        //System.out.println(users.remove("joao@joao.com"));
        /*
        users.forEach((k,v) -> System.out.printf("key: %s | value: %s",k,v));
        System.out.println("--------------------------------");
        users.replace("joao@joao.com", new User("João", 21)); Altera o valor
        users.forEach((k,v) -> System.out.printf("key: %s | value: %s",k,v));
         */


    }
}
