package com.syn_thread;

public class SellTicketThread implements Runnable {
    private Ticket ticket;
    public SellTicketThread(Ticket t){
        ticket=t;
    }
    public void run(){
        while(true){
            this.notify();
           boolean flag;
           synchronized (ticket) {
           flag=ticket.sell(Thread.currentThread().getName());
           }
         try{ Thread.sleep(10);}
          catch(Exception e){}
           if (!flag) break;
        }
    }
}
