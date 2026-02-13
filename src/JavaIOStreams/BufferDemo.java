package JavaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Text.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(5);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

//        int x;
//        while ((x=bis.read())!=-1){
//            System.out.print((char)x);
//        }



        System.out.println("\nfile "+fis.markSupported());
        System.out.println("Buffer "+bis.markSupported());
    }
}
