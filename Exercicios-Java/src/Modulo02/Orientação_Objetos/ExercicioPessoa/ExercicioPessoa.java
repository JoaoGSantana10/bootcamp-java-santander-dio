package Modulo02.Orientação_Objetos.ExercicioPessoa;

import java.util.Scanner;

public class ExercicioPessoa {
    public static void main(String[] args){
    var sc = new Scanner(System.in);
    // Orientação a Objetos
    var H = new Pessoa("João", 20);
    //H.setName("João");
    //H.setAge(20);
    var M = new Pessoa("Maria", 20);
    //M.setName("Maria");
    //M.setAge(20);
    System.out.println("Homem nome: " + H.getName() + "\n idade: " + H.getAge() + " anos");
    System.out.println("Mulher nome: " + M.getName() + "\n idade: " + M.getAge() + " anos");


    }
}
