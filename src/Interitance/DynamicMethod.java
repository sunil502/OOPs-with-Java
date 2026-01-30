package Interitance;

class Supers{
    public void meth1(){
        System.out.println("Supers meth1");
    }
    public void meth2(){
        System.out.println("Supers meth2");
    }
}

class Subs extends Supers{
    @Override
    public void meth2(){
        System.out.println("Subs meth2");
    }
    public void meth3(){
        System.out.println("Subs meth3");
    }
}

public class DynamicMethod {
    public  static  void main(String[] args){
//        Supers sup=new Supers();
//        sup.meth1();
//        sup.meth2();
//
//        Subs s=new Subs();
//        s.meth1();
//        s.meth2();
//        s.meth3();

        Supers ss=new Subs();
        ss.meth1();
        ss.meth2();

    }
}
