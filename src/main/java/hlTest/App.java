package hlTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public void runRunable(){
//        Thread
    }

    public static void main( String[] args )
    {
        final DoubtfulLock lock = new DoubtfulLock();
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(run1);
        executorService.submit(run2);
    }
}
