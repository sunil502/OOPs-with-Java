package Interitance;

class Rectangles{
    int length;
    int breadth;

    Rectangles(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println("length is:"+this.length);
        System.out.println("breadth is:"+this.breadth);
    }
}


public class thisAndSuper {
    public static void main(String[] args){
        Rectangles r1=new Rectangles(8,5);
        r1.display();

        Rectangles r2=new Rectangles(18,25);
        r2.display();
    }
}
