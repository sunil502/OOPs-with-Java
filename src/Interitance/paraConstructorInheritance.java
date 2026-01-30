package Interitance;

class Parents{
    Parents(){
        System.out.println("non-param of parent");
    }
    Parents(int x){
        System.out.println("param of parent "+x);
    }
}

class Childs extends Parents{
    Childs(){
        System.out.println("non-param of Child");
    }
    Childs(int y){
        System.out.println("param of child ");
    }
    Childs(int x,int y){
        super(x);
        System.out.println("2 param of child " +y);
    }
}


public class paraConstructorInheritance {
    public static void main(String[] args){
        Childs c=new Childs(10,20);
    }
}
