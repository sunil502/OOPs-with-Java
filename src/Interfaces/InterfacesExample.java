package Interfaces;

import java.io.ByteArrayInputStream;

interface Test1{
    void meth1();
    void meth2();
}

class Test2 implements Test1{
    public void meth1(){
        System.out.println("meth1 of class Test2");
    }
    public void meth2(){
        System.out.println("meth2 of class Test2");
    }
    public void meth3(){
        System.out.println("meth2 of class Test2");
    }
}

public class InterfacesExample {
    public static void  main(String[] args){
        Test1 t=new Test2();
        t.meth1();
        t.meth2();

        Test2 t2=new Test2();
        t2.meth1();
        t2.meth2();
        t2.meth3();
    }
}
