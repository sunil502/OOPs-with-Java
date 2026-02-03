package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourcesDemo {

    static FileInputStream fi;
    static Scanner sc;
    static void Divide() throws Exception {
        fi=new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Text.txt");
        sc=new Scanner(fi);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/b);

        fi.close();
//        sc.close();
    }

    public static void main(String[] args) throws Exception{
        Divide();
        int x=sc.nextInt();
        System.out.println(x);
    }
}
