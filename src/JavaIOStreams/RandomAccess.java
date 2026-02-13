package JavaIOStreams;

import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args)throws Exception {
        RandomAccessFile rf=new RandomAccessFile("C:/Users/Sunil/Desktop/OOPS/Text.txt","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('D');
        System.out.println((char)rf.read());
        rf.skipBytes(2);
        System.out.println((char)rf.read());
        rf.seek(4);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
    }
}
