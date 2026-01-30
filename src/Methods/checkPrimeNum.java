package Methods;

import java.util.Scanner;

public class checkPrimeNum {
    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return  true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isPrime(a));
    }
}
