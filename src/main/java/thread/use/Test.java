package thread.use;

public class Test {
    public static void main(String ar[]){
        Object lock=new Object();
        PrintThreadA ta=new PrintThreadA(lock);
        PrintThreadB tb=new PrintThreadB(lock);
        ta.start();tb.start();
    }
}
