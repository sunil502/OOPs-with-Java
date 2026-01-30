package Methods;

import java.util.Arrays;

public class reaverseAnumberAndArray {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    static int []reverse(int A[]){
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];

        return B;
    }


    public static void  main(String[] args){
        System.out.println("Reverse number is:"+reverse(354));
        int arr[]={4,6,2,8,3};
        int revArr[]=reverse(arr);
        System.out.println("Reversed array is:"+Arrays.toString(revArr));
    }
}
