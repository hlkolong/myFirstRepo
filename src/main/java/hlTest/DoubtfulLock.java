package hlTest;

public class DoubtfulLock {
    boolean isLocked = false;
    Thread  lockedBy = null;
    int lockedCount = 0;
    public synchronized void lock()
            throws InterruptedException{
        Thread thread = Thread.currentThread();
        while(isLocked && lockedBy != thread){
            System.out.println("Waiting!!!");
            wait();
//            Thread.sleep(10000);
        }
        isLocked = true;
        lockedCount++;
        lockedBy = thread;
        System.out.println("I have been locked by " + Thread.currentThread().getName());
        Thread.sleep(10000);
    }
    public synchronized void unlock(){
        if(Thread.currentThread() == this.lockedBy){
            lockedCount--;
            if(lockedCount == 0){//获得该锁的那个线程，获得了多少次该锁（即调用了几次lock方法，即重入了几次），就得unlock几次，即lockedCount=0，才会把那些wait（阻塞）的线程唤醒
                isLocked = false;
                notify();
            }
        }
    }
}
