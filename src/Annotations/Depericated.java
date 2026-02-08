package Annotations;

class OldClass{
    public void display(){
        System.out.println("hello");
    }

    @Deprecated
    public void show(){
        System.out.println("hi");
    }
}

public class Depericated {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        OldClass oc=new OldClass();
        oc.display();
        oc.show();
    }
}
