package LambdaExpressions;

@FunctionalInterface
interface MyLambda3{
    public int add(int x,int y);
}

public class LambddaSum {
    public static void main(String[] args) {
        MyLambda3 m=(a,b)->{
            return a+b;//also remove return
        };
        System.out.println(m.add(23,65));
    }
}
