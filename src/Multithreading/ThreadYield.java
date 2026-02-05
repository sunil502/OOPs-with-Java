package Multithreading;
class MyThread4 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +"My thread");
        }
    }
}
public class ThreadYield {
    public static void main(String[] args) throws Exception{
        MyThread4 t=new MyThread4();
        t.start();

        int count=1;
        while(true){
            System.out.println(count++ +"Main");
            Thread.yield();
        }
    }
}
