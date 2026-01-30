package Methods;

public class gcd2Num {
    static int Gcd(int x,int y){
        while(x!=y){
            if(x>y)x=x-y;
            else y=y-x;
        }
        return x;
    }

    public static void  main(String[] args){
        int a=25,b=15;
        System.out.println(Gcd(a,b));
    }
}
