package LambdaExpressions;

@FunctionalInterface
interface MyLambda{
    public void display();
}

class My implements MyLambda{
    public void display(){
        System.out.println("hello World");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m=new My();
        m.display();
    }
}
