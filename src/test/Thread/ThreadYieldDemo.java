package test.Thread;

class MyThread8 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(200);

            }catch (InterruptedException e){
            }
            System.out.println(Thread.currentThread().getName()+"  i:"+i);
            if(i==2){
                System.out.println("线程礼让");
                System.out.println(Thread.currentThread().getName()+"运行");
                Thread.yield();
            }
        }
    }
}

public class ThreadYieldDemo {
    public static void main(String[] args){
        MyThread8 myThread8=new MyThread8();
        Thread thread1=new Thread(myThread8,"线程A");
        Thread thread2=new Thread(myThread8,"线程B");
        thread1.start();
        thread2.start();
    }
}
