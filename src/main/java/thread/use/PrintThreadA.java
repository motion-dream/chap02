package thread.use;

public class PrintThreadA extends Thread{
    private Object lock;
    public PrintThreadA(Object lock){
        this.lock=lock;
    }
    public void run(){
        synchronized (lock) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("thread A " + i);
                if (i%5==0){
                    lock.notify();
                    if (i!=100)
                    try{lock.wait();}catch(Exception e){}
                }
            }
        }
    }
}
