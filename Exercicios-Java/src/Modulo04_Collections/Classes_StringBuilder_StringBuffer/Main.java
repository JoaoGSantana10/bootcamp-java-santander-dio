package Modulo04_Collections.Classes_StringBuilder_StringBuffer;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args){

        var builder = new StringBuilder("1234567890");
        builder.setLength(5); // Reduz o tamanho da String
        System.out.println(builder.delete(0,3)); // Deleta a posição na String que você passou como parâmetro
        System.out.println(builder.deleteCharAt(0)); // Deleta uma posição da String
        System.out.println(builder.reverse()); // Vai inverter a String
        System.out.println(builder.lastIndexOf("7")); // Pega o índice da String
        System.out.println(builder.insert(5, "a")); // Insere a String na posição que você quer
        System.out.println(builder.insert(builder.length() -1, "a")); // Garante que você vai conseguir
        // inserir na última posição
        System.out.println(builder);


        /*
        var stringStart = OffsetDateTime.now();
        String stringConcat = "";
        stringConcat += "2";
        for (int i = 0; i < 200_000; i++) {
            stringConcat += i;
        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String: %s \n", getInterval(stringStart, stringEnd));

        var builderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder();
        for (int i = 0; i < 200_000; i++) {
            builderConcat.append(i);
        }
        var builderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (singlethread): %s \n", getInterval(builderStart, builderEnd));

        var bufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat = new StringBuffer();
        for (int i = 0; i < 200_000; i++) {
            bufferConcat.append(i);
        }
        var bufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuffer (multithread): %s \n", getInterval(bufferStart, bufferEnd));




    private static long getInterval(OffsetDateTime stringStart, OffsetDateTime stringEnd) {
        return Duration.between(stringStart, stringEnd).toMillis();
    }
         */
    }
}
