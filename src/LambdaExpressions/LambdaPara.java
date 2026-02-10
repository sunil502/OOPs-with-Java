package LambdaExpressions;

@FunctionalInterface
interface MyLambda2{
    public void display(String str);
}

public class LambdaPara {
    public static void main(String[] args) {
        MyLambda2 m=(s)->{
            System.out.println(s);
        };
        m.display("java programing");
    }
}
