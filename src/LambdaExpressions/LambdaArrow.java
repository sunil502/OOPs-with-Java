package LambdaExpressions;

@FunctionalInterface
interface MyLambda1{
    public void display();
}

public class LambdaArrow {
    public static void main(String[] args) {
        MyLambda1 m=()->{
            System.out.println("hello world");
        };
        m.display();
    }
}
