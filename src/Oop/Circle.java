package Oop;

class Circles {
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
}

public class Circle{
    public static void main(String[] args){
        Circles c1=new Circles();
        Circles c2=new Circles();

        c1.radius = 5;
        c2.radius = 7;

        System.out.println("area1 is:"+c1.area());
        System.out.println("circumference1 is:"+c1.circumference());

        System.out.println("area2 is:"+c2.area());
        System.out.println("circumference2 is:"+c2.circumference());

    }
}