package Interitance;

class Parent{
    public Parent(){
        System.out.println("parentConstructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("childConstructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandchildConstructor");
    }
}


public class inheritanceConstructor {
    public static void main(String[] args){
//        Parent p=new Parent();
        GrandChild c=new GrandChild();
    }
}
