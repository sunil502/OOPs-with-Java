package Methods;

public class changeIndexNum2 {
    static void change(int x,int value){
        x=value;
    }

    public static void main(String[] args){
        int x=10;
        change(x,20);
        System.out.println("value of primitive "+x);
    }
}
