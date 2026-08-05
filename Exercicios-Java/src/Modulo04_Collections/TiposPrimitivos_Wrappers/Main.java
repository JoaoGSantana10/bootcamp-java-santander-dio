package Modulo04_Collections.TiposPrimitivos_Wrappers;

public class Main {
    public static void main(String[] args){

        var user = new User("João", 20);
        printValue(user);
        System.out.println(user);


        /*

        Autobox: conversão automática de um tipo de dado primitivo para a sia classe wrapper
        Integer i = 1;
        i++;

        UnBox: Pega e acessa o tipo primitivo armazenado
        Integer i = 1;
        i.intValue();
         */
        /*
        Tipos primitivos:

        boolean b;
        byte by;
        short s;
        char c;
        int i;
        float f;
        long l;
        double d;

        Objetos:

        Boolean b;
        Byte by;
        Short s;
        Integer i;
        Float f;
        Long l;
        Double d;
         */



    }
    private static void printValue(User user){
        user.setName("Lucas");
        user.setAge(23);

        //user = new User("Lucas", 23);
        System.out.println(user);
    }

}
