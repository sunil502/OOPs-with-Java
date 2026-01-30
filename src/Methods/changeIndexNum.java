package Methods;

public class changeIndexNum {
    static void change(int X[],int index,int value){
        X[index]=value;
    }

    public static void main(String[] args){
        int A[]={2,4,6,8,9};
        change(A,2,35);

        for(int x:A){
            System.out.print(x+" ");
        }
    }
}
