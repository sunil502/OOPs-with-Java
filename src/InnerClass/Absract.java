package InnerClass;

abstract class My
{
    abstract public void show();
}
class Outer2
{
    public void display()
    {
        new My(){public void show() {System.out.println("hello");}}.show();
    }

}

public class Absract {
    public  static void main(String[] args){
        Outer2 o=new Outer2();
        o.display();
    }
}
