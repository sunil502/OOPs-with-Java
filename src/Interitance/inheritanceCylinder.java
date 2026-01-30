package Interitance;

class circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends circle{
    public double height;
    public  double volume(){
        return area()*height;
    }
}


public class inheritanceCylinder {
    public static void main(String[] args){
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=5;

        System.out.println("volume of cylinder is:"+c.volume());
        System.out.println("area is:"+c.area());
    }
}
