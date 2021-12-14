package test.Thread;


import sun.security.krb5.internal.Ticket;

class MyThread11 implements Runnable{
    private int ticket=5;
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            this.sale();
        }

    }
    public synchronized void sale(){
        if (ticket>0){
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){

            }
            System.out.println("卖票:ticket:"+ticket-- );
        }

    }
}
public class SyncDemo03 {
    public static void main(String[] args){
        MyThread11 myThread11=new MyThread11();
        Thread thread1=new Thread(myThread11);
        Thread thread2=new Thread(myThread11);
        thread1.start();
        thread2.start();

    }
}
