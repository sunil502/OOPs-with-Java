package Multithreading;

class MyThread2 extends Thread{
    public  MyThread2(String name){
        super(name);
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args){
        MyThread2 t=new MyThread2("My thread 2");
        t.start();
        t.interrupt();
    }
}
