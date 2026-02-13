package JavaIOStreams;

import java.io.FileInputStream;

public class DataInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Student2.txt");
        java.io.DataInputStream dis=new java.io.DataInputStream(fis);

        Student2 s=new Student2();

        s.rollNo=dis.readInt();
        s.name= dis.readUTF();
        s.avg=dis.readFloat();
        s.dept=dis.readUTF();

        System.out.println("Roll no."+s.rollNo);
        System.out.println("Name "+s.name);
        System.out.println("Average "+s.avg);
        System.out.println("Department "+s.dept);

        dis.close();
        fis.close();
    }
}
