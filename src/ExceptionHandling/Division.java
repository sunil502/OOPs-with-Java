package ExceptionHandling;

import java.util.Scanner;
import java.util.*;

public class Division {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();

        try{
            c=a/b;
            System.out.println("Result is:"+c);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Denominator should not be zero,try again");
        }
    }
}
