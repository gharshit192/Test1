


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        String name ="RADAR";
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Runnable worker2 = new MyWorkerThread(name);
        executor.execute(worker2);

        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("Finished All Threads");
    }

}

