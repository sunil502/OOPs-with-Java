package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Resources {

        static void Divide() throws Exception {
            try (FileInputStream fi = new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Text.txt");
                 Scanner sc = new Scanner(fi)) {

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println(a / c);
            }
        }

        public static void main(String[] args) throws Exception{
            try{
                Divide();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
}
