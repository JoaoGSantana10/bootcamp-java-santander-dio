package Modulo04_Collections.Listas_Arrays;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args){

        List<Integer> arrayList = new ArrayList<>();
        var arrayStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());

        var vectorStart = OffsetDateTime.now();
        List<Integer> vector = new Vector<>();
        for (int i = 0; i < 100_000_000; i++) {
            vector.add(i);
        }
        System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());



        /*
        var user = new User(10, "João");
        users.add(user);
        users.add(new User(7, "Pedro"));
        users.add(new User(2, "Lucas"));
        System.out.println(users);
        System.out.println(users.remove(new User(1, "Lucas")));
        System.out.println(users.remove(1));
        System.out.println(users);
        users.clear();
        System.out.println(users);
         */


        /*
        users.add(new User(17, "Lucas"));
        System.out.println(users.contains(user));
        System.out.println(users.contains(new User(10, "João")));
        System.out.println(new User(1, "João"));
        System.out.println(new User(1, "João").equals(new User(1, "João")));
         */

        /*
        System.out.println(users.size()); // Verifica o tamanho da lista
        System.out.println(users.isEmpty()); // Verifica se a lista está vazia
        System.out.println(users.getFirst()); // Pega o primeiro elemento
        System.out.println(users.get(0)); // Outra forma de pegar o primeiro elemento
        System.out.println(users.getLast()); // Pega o último elemento
        System.out.println(users.size() - 1); // Outra forma de pegar o segundo elemento
         */


        /*
        int[] codes = new int[2]; // Exemplos de Array
        //int[] codes = {10, 7}; Outra forma de ser declarado
        codes[0] = 10; // Atribuindo valores ao Array
        codes[1] = 7;
        System.out.println(codes.length); // Mostra o tamanho
        System.out.println(codes[0]); // Mostra os valores armazenados
        System.out.println(codes[1]);
        System.out.println("-----------------------------------");
        List<Integer> codes2 = new ArrayList<>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
        codes2.forEach(System.out::println);
        List<Integer> codes3 = new LinkedList<>();
         */


    }
}
