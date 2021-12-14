package test.Thread;

import test.ImplementsTest;

class zhangsan{
    public void get(){
        System.out.println("张三：get");
    }
    public void say(){
        System.out.println("张三：say");
    }
}
class lisi{
    public void get(){
        System.out.println("李四：get");
    }
    public void say(){
        System.out.println("李四：say");
    }
}

public class ThreadDeadLock implements Runnable {
    private static zhangsan zs=new zhangsan();
    private static lisi ls=new lisi();
    private boolean flag=false;

    @Override
    public void run() {
        if(flag) {
            synchronized (zs) {
                zs.say();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {

                }
                synchronized (ls){
                    ls.get();
                }
            }
        }
        else{
            synchronized (ls){
                ls.say();
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){

                }
                synchronized (zs){
                    zs.get();
                }
            }
        }
    }
    public static void main(String[] args) {
        ThreadDeadLock threadDeadLock = new ThreadDeadLock();
        ThreadDeadLock threadDeadLock1=new ThreadDeadLock();
        threadDeadLock.flag=true;
        threadDeadLock1.flag=false;
        Thread thread = new Thread(threadDeadLock);
        Thread thread1=new Thread(threadDeadLock1);
        thread.start();
        thread1.start();
    }
}