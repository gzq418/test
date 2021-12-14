package test.Thread;
class Mythread5 implements Runnable{
    private String name;
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            try{
                Thread.sleep(500);
                System.out.println("休眠结束");
            }catch (InterruptedException e){
                System.out.println("休眠被终止");
                return;//返回被调用处

            }
        }

    }
}
public class ThreadInterruptDemo {
    public static void main(String[] args){
        Mythread5 mythread5=new Mythread5();
        Thread thread=new Thread(mythread5,"线程A：");
        thread.start();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("线程被终止");

        }
        thread.interrupt();//中断线程运行
    }
}
