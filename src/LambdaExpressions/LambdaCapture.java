package LambdaExpressions;

@FunctionalInterface
interface MyLambda4{
    public void display();
}

class Demo{
    int temp=10;
    public void method1(){
        int count=0;
        MyLambda4 m1=()->{
            System.out.println("hi");
            System.out.println("bye"+(" "+ ++temp));
        };
        m1.display();
    }
}

public class LambdaCapture {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
}
