package Modulo02.Orientação_Objetos.ExercicioRecords;

public record Person(String name, int age) {

    /*
    No record para declarar o atributo sem ser estático passa ele como parâmetro e faz dele o construtor e
    todos atributos declarados eles são privados no construtor para acessar ele basta fazer na main chamar nome da
    variável que você declarou recebendo new Person(); e chamar da seguinte forma: person.name() e person.age()
     */

    /*
    Ele é imutável não pode alterar
    Não permite construtor sem argumentos
    Só permite propriedades estáticas no corpo dele
    E pode trabalhar com métodos
     */

    /*
    O record é para trabalhar com objetos imutáveis que não mudam os atributos uma vez que foi definido só muda
    se fizer outra instâcia, exemplo: var newPerson = new Person(person.name(), 21);
     */

    // Quando for declarar o atributo ele tem que ser estático
    //private static String nome;


    // Construtor compactor serve para validação de dados
    public Person{
        System.out.println("------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println("------------------");

    }

    // Construtor secundário
    public Person(String name){
        this(name, 1);
    }

    public String getInfo(){
        return "Name: " + name + " \nage: " + age;
    }


}
