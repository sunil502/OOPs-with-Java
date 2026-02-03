package Oop;

class cylinders{
    public double radius;
    public int height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height;
    }
}

public class Cylinder {
    public static void main(String[] args){
        cylinders c=new cylinders();

        c.radius=5;
        c.height=3;

        System.out.println("lidarea is:"+c.lidArea());
        System.out.println("Total area is:"+c.totalSurfaceArea());
        System.out.println("circumference is:"+c.circumference());
        System.out.println("volume is:"+c.volume());
    }
}
