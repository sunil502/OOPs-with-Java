package Multithreading;

class MyData{
    public void display(String str){
        synchronized (this){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
            }
        }

    }
}
class MyThread5 extends Thread{
    MyData d;
    public MyThread5(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("hello world");
    }
}

class MyThread6 extends Thread{
    MyData d;
    public MyThread6(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Welcome All");
    }
}

public class SyncDemo {
    public static  void  main(String[] args){
        MyData data=new MyData();
        MyThread5 t1=new MyThread5(data);
        MyThread6 t2=new MyThread6(data);

        t1.start();
        t2.start();
    }
}
