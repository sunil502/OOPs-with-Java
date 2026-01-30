package oop;

class  rectangles{
    //properties
    public int length;
    public int breadth;

    //methods
    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public boolean isRetangle(){
        if(length==breadth)
            return true;
        else
            return false;
    }
}

public class Rectangle {
    public static void main(String[] args){
        rectangles r=new rectangles();

        r.breadth=7;
        r.length=5;

        System.out.println("area is :"+r.area());
        System.out.println("perimeter is :"+r.perimeter());
        System.out.println("id it is a Square :"+r.isRetangle());
    }
}