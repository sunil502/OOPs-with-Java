package oop;

class Rectangless{
    public double length;
    private double breadth;

    //para
    public Rectangless(double l,double b){
        length=l;
        breadth=b;
    }

    //non-para
    public Rectangless(){
        length=1;
        breadth=1;
    }

    public Rectangless(double s){
        length=breadth=s;
    }

    public double area(){
        return length*breadth;
    }
}

public class constructorRectangle {
    public  static  void main(String[] args){
        Rectangless r=new Rectangless();
        Rectangless r2=new Rectangless(5.4,6.3);
        Rectangless r3=new Rectangless(5);

        System.out.println("area1 is:"+r.area());
        System.out.println("area2 is:"+r2.area());
        System.out.println("area3 is:"+r3.area());
    }
}
