package Modulo04_Collections.ClasseCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ParseException {

        var calendar = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss Z");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)); // O mês começa com zero na Classe Calendar
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 5); // Fazendo conta com Calendar
        calendar.set(Calendar.YEAR, 2030); // Atribuindo o ano de 2030
        System.out.println(formatter.format(calendar.getTime()));
        var newCallendar = Calendar.getInstance();
        newCallendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) + 1);
        System.out.println(calendar.after(newCallendar)); // Verifica se o calendar vem depois de newCallendar
        System.out.println(calendar.before(newCallendar)); // Verifica se o calendar vem antes de newCallendar
        System.out.println(calendar.equals(newCallendar)); // Verifica se é igual
        var stringDate = formatter.format(calendar.getTime());
        stringDate = stringDate.replace("21:", "23:"); // Colocar a hora atual para fazer o replace
        var newDate = formatter.parse(stringDate);
        var newCallendar1 = Calendar.getInstance();
        newCallendar1.setTime(newDate);
        System.out.println(formatter.format(calendar.getTime()));
        System.out.println(formatter.format(newCallendar1.getTime()));




    }
}
