package Methods;

public class calculateAreaOverload {
    static double area(double radius) {
        return Math.PI*radius*radius;
    }
    static double area(double length,double breadth){
        return length*breadth;
    }

    public static void main(String[] args){
        System.out.println("area of circle is:"+area(2.5));
        System.out.println("area of rectangle is:"+area(4,7));
    }
}
