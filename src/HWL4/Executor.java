package HWL4;




public class Executor {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println ("Task executed");
        java.util.concurrent.Executor executor = (runnable)->{
            new Thread (runnable).start ();

        };
        executor.execute (task);
    }
}

//ExecutorService executor = Executors.newSingleThreadExecutor();
//executor.submit(() -> {
//    String threadName = Thread.currentThread().getName();
//    System.out.println("Hello " + threadName);
//});