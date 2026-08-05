package Modulo04_Collections.ClasseString;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        var test = "%s";
        System.out.println(String.format(test,"Java"));
        System.out.printf("Trabalhando com %s", "Java");


        var value = "a";
        System.out.println(value.repeat(5)); // faz uma repetição da String




        /*
        var value = """
                {"name":"João,"age":18}""";
        Map<String, String> map = new HashMap<>();
        value = value.replace("{", "").replace("}","").replace("\"", "");
        var valueArr = value.split(",");
        for (var v : valueArr){
            var keyValue = v.split(":");
            map.put(keyValue[0], keyValue[1]);
        }
        System.out.println(map);

         */

        /*
        var value = "java;java;java;java";

        value = value.replaceFirst("j","J"); // Troca só o primeiro

        value = value.replace("j","J"); // Troca todos
        var values = value.split(";",2);
        for (var v : values) {
            System.out.println(v);
        }
        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());



        System.out.println(value.contains(";")); // Verifica se ele tem determinado caractere
        System.out.println(value.indexOf("j",1, 5)); // Verifica o índice da String
        System.out.println(value.startsWith("ja")); // Verifica se a String começa com a String informada
        System.out.println(value.endsWith("va")); // Verifica se a String termina com a String informada
        System.out.println(value.isBlank()); // Verifica se a String está vazia não considera espaços em branco
        // somente caractere
        System.out.println(value.trim()); // Ignora os espaços em branco
        System.out.println(value.substring(8, 12)); // Faz a extração dos valores pelo índice
        */




    }
}
