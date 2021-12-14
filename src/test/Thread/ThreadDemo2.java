package test.Thread;

class MyThread1 extends Thread{
    private String name;
    public MyThread1(String name){
        this.name=name;
    }
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println(this.name+i);
//        }
//    }


}
public class ThreadDemo2 {
    public static void main(String[] args){
        MyThread1 myThread1=new MyThread1("线程A：");
        MyThread1 myThread2=new MyThread1("线程B：");
        myThread1.start();
        myThread2.start();
        Thread thread;



    }
}
