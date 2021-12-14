package test.Thread;

class MyThread implements Runnable{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(this.name+i);
        }

    }
}
public class RunnableDemo1  {
    public static void main(String[] args){
        MyThread myThread1=new MyThread("线程A：");
        MyThread myThread2=new MyThread("线程B：");
        Thread thread1=new Thread(myThread1);
        Thread thread2=new Thread(myThread2);
        thread1.start();
        thread2.start();

    }
}
