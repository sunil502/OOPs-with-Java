package JavaIOStreams;

import java.io.ByteArrayInputStream;

public class ByteArray {
    public static void main(String[] args) throws Exception{
        byte b[]={'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);

        int x;
        while ((x= bis.read())!=-1){
            System.out.print((char)x+" ");
        }


        bis.close();
    }
}
