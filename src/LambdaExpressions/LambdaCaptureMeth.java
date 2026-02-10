package LambdaExpressions;

@FunctionalInterface
interface MyLambda5{
    public void display();
}
class UseLambda{
    public void callLambda(MyLambda5 m5){
        m5.display();
    }
}

class Demo1{
    public void Method2(){
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{
            System.out.println("Hello");
        });
    }
}


public class LambdaCaptureMeth {
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.Method2();
    }
}
