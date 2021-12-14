package test.Thread;

class Mythread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
public class RunnableDemo2 {
    public static void main(String[] args){
        Mythread2 myThread=new Mythread2();
        new Thread(myThread).start();
        new Thread(myThread,"线程c:").start();
    }


}
