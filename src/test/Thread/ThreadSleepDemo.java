package test.Thread;

class Mythraed3 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
public class ThreadSleepDemo {
    public static void main(String[] args){
        Mythraed3 mythraed3=new Mythraed3();
        Thread thread=new Thread(mythraed3,"线程A:");
        thread.start();

    }
}
