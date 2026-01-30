package AbstractClass;

abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius* radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;

    @Override
    public double perimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double area() {
        return length*breadth;
    }
}

public class AbstractShape {
    public  static void  main(String[] args){
        Rectangle r=new Rectangle();
        r.length=8;
        r.breadth=3;
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Shape s1=r;
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Circle c=new Circle();
        c.radius=5;
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Shape s2=c;
        System.out.println(s2.area());
        System.out.println(s2.perimeter());

    }
}
