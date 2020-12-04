package com.thread;

public class MyThread implements Runnable {
    private int count;
    public MyThread(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }
    public void run(){
        for(int i=0;i<10;i++){
            count++;
        }
        System.out.println("count="+count);
    }
}
