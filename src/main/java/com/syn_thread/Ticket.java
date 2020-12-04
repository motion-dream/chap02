package com.syn_thread;

public class Ticket {
    private int num;
    public Ticket(int num){
        this.num=num;
    }
    //synchronzied加在方法上，方法就是同步de了，一次只能一个线程调用
    //可以定义同步块

    /**
     *
     * synchronized(Object){
     *
     * }
     */
    public boolean sell(String name){
        num--;
        if (num<0) return false;
        System.out.println(name+"卖出yizhang,haisheng"+num);
        return true;
    }
}
