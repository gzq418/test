package test.Thread;
class MyThread7 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName()+"  i="+i);
            }
            catch (InterruptedException e){

            }
        }
    }
}

public class ThreadPriorityDemo {//不要假定高优先级的线程一定先于低优先级的线程执行，不要有逻辑依赖于线程优先级
                                  //线程优先级对于不同的线程调度器可能有不同的含义
                                  //并非优先级越高就一定会先执行，哪个线程先执行将由 CPU 的调度决定
    public static void main(String[] args){
        MyThread7 myThread1=new MyThread7();
        MyThread7 myThread2=new MyThread7();
        MyThread7 myThread3=new MyThread7();
        Thread thread=new Thread(myThread1,"线程A");
        Thread thread1=new Thread(myThread2,"线程B");
        Thread thread2=new Thread(myThread3,"线程C");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
