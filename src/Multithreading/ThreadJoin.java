package Multithreading;

class MyThread3 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) throws Exception{
        MyThread3 t=new MyThread3();
        t.setDaemon(true);
        t.start();
        Thread mainThread=Thread.currentThread();
        mainThread.join();
    }
}
