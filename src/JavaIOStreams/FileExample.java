package JavaIOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream( "C:/Users/Sunil/Desktop/OOPS/Text.txt");
            String str="Learn java programming";

            byte b[]=str.getBytes();
            for(byte x:b)
                fos.write(x);
//
//            fos.write(b,6,str.length()-6);
//
//            fos.write(str.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
