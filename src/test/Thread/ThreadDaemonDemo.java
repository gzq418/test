package test.Thread;
class MyThread6 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"在运行");
        }

    }
}

public class ThreadDaemonDemo {
    public static void main(String[] args){
        MyThread6 myThread6=new MyThread6();
        Thread thread=new Thread(myThread6,"线程");
        thread.setDaemon(true);//线程在后台运行
        thread.start();

    }
}
