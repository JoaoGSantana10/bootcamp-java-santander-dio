package Modulo04_Collections.Thread_Runnable;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ContadorMultiThread {

    private final static Queue<Integer> numbers = new LinkedBlockingQueue<>();

    // private static AtomicInteger numbers = new AtomicInteger(0); // Para trabalhar com números e garantir o valor
    // em um cenário MultiThread e depois é so trocar o numbers.add por numbers.incrementAndGet()

    private static void inc(int number) {
        numbers.add(number);
    }

    private static void show() {
        System.out.println(numbers);
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable inc = () -> {
            for (int i = 0; i < 100; i++) {
                inc(i);
            }
        };

        Runnable dec = () -> {
            for (int i = 0; i > -100; i--) {
                inc(i);
            }

        };

        Runnable show = () -> {
            for (int i = 0; i < 250; i++) {
                show();
            }
        };

        var execInc = new Thread(inc);
        execInc.start();
        // execInc.join(Duration.ofSeconds(8));
        // execInc.setName(""); Podemos definir o nome da nossa Thread
        var execDec = new Thread(dec);
        execDec.start();
        // execDec.join(Duration.ofSeconds(8)); // Prioriza os números negativos
        var execShow = new Thread(show);
        execShow.start();

        System.out.println(execDec.getName());
        System.out.println(execInc.getName());
        System.out.println(execShow.getName());


    }
}


