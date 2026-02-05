package Multithreading;

public class RunnableThread implements Runnable{
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String[] args){
        RunnableThread t=new RunnableThread();
        Thread th=new Thread(t);
        th.start();
        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
