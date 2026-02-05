package Multithreading;

class MyThread1 extends Thread{
    public  MyThread1(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+3);
    }
}

public class ConstructorThread {
    public  static void  main(String[] args) throws Exception{
        MyThread1 t=new MyThread1(("My Thread 1"));
        System.out.println("ID:"+t.getId());
        System.out.println("Name:"+t.getName());
        System.out.println("Priority:"+t.getPriority());
        System.out.println("State:"+t.getState());
    }
}
