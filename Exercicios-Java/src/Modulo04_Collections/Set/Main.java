package Modulo04_Collections.Set;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        // Set<User> users = new HashSet<>();
        // Set<User> users = new LinkedHashSet<>(); // Mantém a ordem inicial de inserção
        // Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId).reversed());
        Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId)); // Forma simplificada
       /*
       Set<User> users = new TreeSet<>((User u1, User u2) -> {{
                int compareResult = 0;
                if (u1.getId() < u2.getId()) compareResult --;
                if (u1.getId() > u2.getId()) compareResult ++;
                return compareResult;
            }
        });

        */
        users.add(new User(1, "João"));
        users.add(new User(2, "Lucas"));
        users.add(new User(3, "Pedro"));
        users.add(new User(4, "Maria"));

        // System.out.println(new User(1, "João").hashCode()); // Mostra o endereço de memória
        // System.out.println(users.contains(new User(1, "João"))); Mostra se esse usuário está na lista
        // users.forEach(System.out::println); // Mostra todas as opções que tem na lista
        // System.out.println(users.removeAll(List.of(new User(1, "João"), new User(2, "Ana"))));
        users.removeIf(Predicate.not(user -> user.getId() > 2)); // Remove os que são menores que 2
        users.removeIf(user -> user.getId() > 2); // Remove que tem o id maior que 2
        System.out.println(users);

        // Verifica se tem próximo elemento no iterator
        /*
        var iterator = users.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
         */

    }

        /*

        50, 25, 120, 80   Recebendo os números

        Se for menor cai para a esquerda se for maior cai para a direita

        100
       /  \
      50   120
      / \
     25  80
         */

}
