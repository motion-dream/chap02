package com.thread;

public class Test {
    public static void main(String[] ar)throws Exception{
        YeildThread yt=new YeildThread();
        yt.start();

        //        MyThread my=new MyThread(1);
//        Thread th1=new Thread(my);
//        System.out.println(Thread.currentThread());
//        System.out.println("***"+th1.getPriority());
//        Thread th2=new Thread(new MyThread(2));
//        th1.start();th2.start();
//        Thread.sleep(2000);
//        System.out.println(my.getCount());
    }
}
