package JavaIOStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOut {
    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

//        byte b[]= bos.toByteArray();
//        for (byte x:b)
//            System.out.print((char)x+" ");

        bos.writeTo(new FileOutputStream("C:/Users/Sunil/Desktop/OOPS/Text.txt"));

        bos.close();
    }
}
