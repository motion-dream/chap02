package thread.use;

public class PrintThreadB extends Thread {
    private Object lock;
    public PrintThreadB(Object lock){
        this.lock=lock;
    }
    public void run(){
       synchronized (lock) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Thread B " + i);
                if (i%5==0){
                    lock.notify();
                    try{lock.wait();}catch(Exception e){}
                }
            }
        }
    }
}
