package JavaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferRead {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("C:/Users/Sunil/Desktop/OOPS/Text.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.mark(5);   // mark position

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println("\nBuffer markSupported: " + bis.markSupported());
    }
}

