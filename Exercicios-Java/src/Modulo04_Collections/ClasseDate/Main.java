package Modulo04_Collections.ClasseDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        var milliseconds = System.currentTimeMillis();
        var date = new Date(milliseconds);
        var newDate = new Date(milliseconds);
        System.out.println((new Date(milliseconds + 999999L).before(date))); // Comparando datas
        System.out.println((new Date(milliseconds + 999999L).after(date))); // Comparando datas
        System.out.println(date.getTimezoneOffset());
        // date.setYear(106); // Pega o ano 1900 e soma com o valor que a gente passa
        // date.setHours(22); // Pega o valor que o usuário passa paras as horas

        //var date = new Date(System.currentTimeMillis() - 99999L); // Gerando data aleatória

        /*
        // se for HH ele trabalha com padrão 24hrs
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss"); // Formatação da data
        System.out.println(date);
        System.out.println(formatter.format(date));
         */

        System.out.println(date);





    }
}
