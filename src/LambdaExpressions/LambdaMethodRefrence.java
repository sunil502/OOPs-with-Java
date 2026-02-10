package LambdaExpressions;

interface MyLambda6{
    public void display(String str);
}


public class LambdaMethodRefrence {
    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda6 m6=LambdaMethodRefrence::reverse;
        m6.display("hello");
    }
}
