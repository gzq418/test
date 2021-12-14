package test.Thread;
class MyThread9 implements Runnable{//一个多线程的程序如果是通过 Runnable 接口实现的，则意味着类中的属性被多个线程共享，
                                    // 如果这多个线程要操作同一个资源时就有可能出现资源同步问题
    private int ticket =5;
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            synchronized(this){
                if (ticket >0){
                    try{
                        Thread.sleep(200);
                    }
                    catch (InterruptedException e){

                    }
                    System.out.println("卖票：ticket:"+ ticket--);

                }
           }

        }
    }
}
public class SyncDemo02 {
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
