package com.thread;

public class YeildThread extends Thread {
    public void run(){
        long beginTime=System.currentTimeMillis();
        long count=0;
        for(int i=0;i<50000;i++){
            Thread.yield();
            count=count+i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-beginTime);
    }
}
