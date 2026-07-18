package Modulo02.Orientação_Objetos.ExercicioRecords;

public class ExercicioPerson {
    public static void main(String[] args){

        var person = new Person("João", 20);
        System.out.println("Olá, " + person.name() + "!");
        System.out.println("Idade = " + person.age());
        System.out.println(person.getInfo());


    }
}
