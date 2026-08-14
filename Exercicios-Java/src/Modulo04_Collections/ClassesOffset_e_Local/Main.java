package Modulo04_Collections.ClassesOffset_e_Local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Main {
    public static void main(String[] args){

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Classe para trabalhar com datas LocalDate:");
        LocalDate localDate = LocalDate.now(); // Obtem a data atual
        // var strDate = "22/12/2030"; Atribuindo uma StringDate
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); Formatação da data
        // System.out.println(LocalDate.parse(strDate, formatter));
        // System.out.println(formatter.format(LocalDate.parse(strDate, formatter))); Data formatada no nosso padrão
        System.out.println(localDate.plus(50, ChronoUnit.DAYS)); // Adicionando 50 dias
        System.out.println(localDate.plusYears(20)); // Adiciona o tanto de anos que o usuário informar
        // Também tem para dias, meses e semanas
        System.out.println(localDate.minusYears(20)); // Subtraindo o tanto de anos que o usuário informar
        // Tem também da mesma forma dias, meses e semanas
        System.out.println(localDate.getMonth()); // Retornar o nome do mês
        System.out.println(localDate.getMonthValue()); // Retorna o número do mês
        // localDate.isEqual(); // Permite trabalhar com diferentes tipos de datas
        // localDate.equals(); // Verifica se são iguais

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Classe para trabalhar com horas LocalTime:");
        LocalTime localTime = LocalTime.now(); // Obtem hora atual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Formatação da hora
         System.out.println(formatter.format(localTime));
         System.out.println(localTime.toSecondOfDay()); // Retorna os segundos dos dias
        // System.out.println(localTime.withHour(1)); // Define a hora que o usuário quer

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Trabalhando com LocalDateTime:");
        LocalDateTime localDateTime = LocalDate.now().atTime(localTime);
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_DATE_TIME;
         System.out.println(formatter1.format(localDateTime));
        // System.out.println(localDateTime.);
        Date date = Date.from(localDateTime.toInstant(ZoneOffset.ofHours(-3))); // Conversão da nossa data para o Date
         System.out.println(date);
        // localDateTime.toInstant(ZoneOffset.ofHours(-3));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Trabalhando com OffsetDateTime:");
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        offsetDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC); // Muda a Time Zone
        System.out.println(offsetDateTime.getOffset());
        /*
        offsetDateTime.isBefore();
        offsetDateTime.isAfter();
        offsetDateTime.isEqual(); // Conseguimos comparar data e hora de diferentes Time Zones para a gente poder
        // conseguir fazer a comparação
        offsetDateTime.equals(); // Ver a igualdade de objetos
         */
        // Comparando para ver se um data e hora é determinado a um mesmo instante
        // OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        // OffsetDateTime offsetDateTime2UTC = offsetDateTime1.withOffsetSameInstant(ZoneOffset.UTC);
        // System.out.println(offsetDateTime1.isEqual(offsetDateTime2UTC));
         OffsetDateTime offsetDateTime1 = Calendar.getInstance().getTime().toInstant().atOffset(ZoneOffset.ofHours(-3));
         System.out.println(offsetDateTime1);





    }

}
