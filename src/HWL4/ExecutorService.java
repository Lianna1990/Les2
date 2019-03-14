package HWL4;

import java.util.concurrent.Executors;

public class ExecutorService {
    public static void main(String[] args) {

    }

    ExecutorService executor = Executors.newSingleThreadExecutor ();
        executor.submit(()->

    {
        String threadName = Thread.currentThread ().getName ();
        System.out.println ("Hello " + threadName);
    }

}
