package Modulo04_Collections.APIdeStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){

        /*
        var value1 = Stream.generate(() -> new Random().nextInt())
                .limit(5) // Limitando para gerar 5 elementos senão iria entrar em loop
                .toArray(Integer[]::new); // gera um array a partir da Stream e  depois a gente passa tipando o array

        for (var v : value1){
            System.out.println(v);
        }

        System.out.println("---------------------------------");

        var value2 = IntStream.generate(() ->  new Random().nextInt())
                .limit(5)
                .toArray();

        for (var v : value2){
            System.out.println(v);
        }

         */

        // List<String> debugValues =  new ArrayList<>();
        var value = java.util.stream.Stream.of("João", "Maria", "Lucas", "Pedro", "Ana", "Marcos") // Gera uma Stream a partir
        // desses valores

        /*
        var value = Stream.of(1, 2, 3, 4, 5, 6, 7)
        // .reduce(0, Integer::sum) // Fazendo a soma com reduce
         */
                // .peek(System.out::println) // peek é recomendado para debug e é uma operação terminal
                // .peek(debugValues::add)
                .filter(name -> name.endsWith("a")) // Recebe um valror e retorna outro e procura nomes que
        //terminam com a letra "a"
                // .allMatch(n -> n.contains("a")) // Verifica se tem algum item que conicida com a letra "a"
                // .findAny() // Busca qualquer elemento da lista ele pega o primeiro que ele achar
                // .reduce("", (a, b) -> a + ";" + b); // Separa os nomes por ";"
                // .reduce("", (a, b) -> a + ";" + b).replaceFirst(";", " ") // Tirando o ";" por um espaço em vazio
                // .findFirst(); // Pega o primeiro elemento depois que aplica o filter
                // .noneMatch(n -> n.contains("a")) // Verifica se nenhum dele contém a letra "a"
                // .anyMatch(n -> n.contains("a"))
                // Verifica se a Stream tem alguma ocorrência da letra "a"
                .limit(2) // Estabelece um limite depois de filtrar
                .toList(); // Converte a Stream em uma lista
        // System.out.println(debugValues);
        System.out.println(value);

        /*
        var value = IntStream.of(1, 2, 3, 4, 5, 6, 7)
                .average(); // Faz a média do valores
         */

        /*
        var value = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 7)
                .distinct().toList(); // Remove valores duplicados da lista
         */

        /*
        var value = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 7)
                //.map(Objects::toString)
                .map(n -> n % 2 == 0) // Lista mapeada por tipos booleanos
                .toList(); // Transforma a lista de valores em uma lista de String
         */

        List<Integer> values1 = List.of(3, 6, 9, 12);
        List<Integer> values2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        var newValues = values2.stream()
                .parallel()
                .filter(values1::contains)
                .peek(n -> System.out.printf("Filter: %s \n", n))
                .map(n -> values1.stream().reduce(n, (n1, n2) -> n1 - n2))
                .peek(n -> System.out.printf("Map: %s \n", n))
                .collect(Collectors.toSet());
        System.out.println(newValues);
    }
}
