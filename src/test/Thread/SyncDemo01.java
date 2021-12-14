package test.Thread;
class MyThread10 extends Thread{
    private int ticket =5;
    @Override
    public void run() {
        for(int i=0;i<100;i++){
//            synchronized(this){
                if (ticket >0){
                    try{
                        Thread.sleep(200);
                    }
                    catch (InterruptedException e){

                    }
                    System.out.println("卖票：ticket:"+ ticket--);

//                }
            }

        }
    }
}
public class SyncDemo01 {
    public static void main(String[] args){
        MyThread9 myThread9=new MyThread9();
        Thread thread1=new Thread(myThread9);
        Thread thread2=new Thread(myThread9);
        Thread thread3=new Thread(myThread9);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
