package Methods;

public class maxNumUsingVarArgs {
    static int max(int ...A){
        if(A.length==0)return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }

    static int sum(int ...A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        return sum;
    }



    public static void main(String[] args){
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));


        System.out.println(sum(new int[]{10,20,30,40}));
    }
}
