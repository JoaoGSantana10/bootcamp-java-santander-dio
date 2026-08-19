package Modulo05.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args){

        // Exception
        // test();
    }

    /*
    Exceções verificada durante a compilação `checked exception`
    private static void test() {
        var stream = new FileOutputStream("");
    }
     */

    // `RuntimeException`: classe pai de exeções não verificadas ela acontece no tempo de execução do código
    /*
    private static void test(){
        System.out.println((10 / 0));
    }
     */

    /*
    private static void test(){
        throw new RuntimeException();
    }
     */

    /*
    private static void test(){
                    // Throwable: pai de tudo qualquer errors e exceptions
                    new Throwable();
            // Exception: Exceções de fato que acontecem no nosso código
                    /              \
            new Exception();  new OutOfMemoryError(); // Errors
        // RuntimeException: São as exceções que vão acontecer no tempo de execução do nosso código
        // FileNotFoundExcetion: Checked exception
        // Todas abaixo vem de Exception
                /                           \
        new RuntimeException();  Unchecked  new FileNotFoundException(); // Checked

    }
     */
}
