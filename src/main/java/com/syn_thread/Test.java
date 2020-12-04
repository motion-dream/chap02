package com.syn_thread;

public class Test {
    public static void main(String[] ar){
        Ticket t=new Ticket(100);
        SellTicketThread s1=new SellTicketThread(t);
        SellTicketThread s2=new SellTicketThread(t);
        SellTicketThread s3=new SellTicketThread(t);
        Thread t1=new Thread(s1);
        new Thread(s2).start();
        new Thread(s3).start();
        t1.start();

    }
}
