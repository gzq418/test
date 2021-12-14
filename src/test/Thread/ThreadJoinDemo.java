package test.Thread;

class Mythread1 implements Runnable{
    private String name;
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("线程运行"+Thread.currentThread().getName()+i);
        }

    }
}
public class ThreadJoinDemo {
    public static void main(String[] args){
        Mythread1 myThread1=new Mythread1();
        Thread thread=new Thread(myThread1,"线程c");
        thread.start();
        for (int i=0;i<50;i++){
            if(i>10){
                try{
                    thread.join();
                }
                catch (InterruptedException e){
                }
            }
            System.out.println("MAIN主线程运行："+i);
        }


    }

}
