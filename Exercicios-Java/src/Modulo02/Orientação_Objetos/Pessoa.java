package Modulo02.Orientação_Objetos;

import java.time.OffsetDateTime;

public class Pessoa {
    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public String getName(){
        return name;
    }

    // Declarando um construtor sem parâmetro ele não precisa ter parâmetro na main
    /*
    public Person(){

    }

     */

    // Construtor com parâmetro requer um parâmetro também na main
    public Pessoa(String name, int age){
        this.name = name;
        this.age = 1;
    }

    /*public void setName(String name){
        this.name = name;
    }

     */

    public int getAge(){
        return age;
    }

    /*
    public void setAge(int age){

        this.age = age;
    }

     */
    public void incAge(){
      if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()){
          return;
      } else {
          this.age += 1;
          this.lastYearAgeInc = OffsetDateTime.now().getYear();
      }
    }


}
