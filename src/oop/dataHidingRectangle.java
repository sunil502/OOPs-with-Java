package oop;

class  hidingRectangles{
    //properties
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    public void setLength(int l) {
        if(l>=0)
            length = l;
        else
            length=0;
    }
    public void setBreadth(int b) {
        if(b>=0)
            breadth = b;
        else
            breadth=0;
    }

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

public class dataHidingRectangle {
    public static void main(String[] args){
        hidingRectangles r=new hidingRectangles();

        r.setLength(7);
        r.setBreadth(9);

        System.out.println("length is:"+r.getLength());
        System.out.println("breadth is:"+r.getBreadth());
        System.out.println("area is :"+r.area());
        System.out.println("perimeter is :"+r.perimeter());
        System.out.println("id it is a Square :"+r.isRetangle());
    }
}