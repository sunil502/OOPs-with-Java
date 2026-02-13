package JavaIOStreams;

import java.io.File;

public class FileHandle {
    public static void main(String[] args)throws Exception {
        File f=new File("C:/Users/Sunil/Desktop/OOPS");
        System.out.println(f.isDirectory());
        File list[]=f.listFiles();
        for(File x:list){
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }

    }
}
