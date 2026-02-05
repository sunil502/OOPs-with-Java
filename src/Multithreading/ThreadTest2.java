package Multithreading;

public class ThreadTest2 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }


    public static void main(String[] args){
        ThreadTest2 t=new ThreadTest2();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
