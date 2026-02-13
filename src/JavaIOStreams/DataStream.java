package JavaIOStreams;

import java.awt.dnd.DropTarget;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student2{
    int rollNo;
    String name;
    float avg;
    String dept;

}

public class DataStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("C:/Users/Sunil/Desktop/OOPS/Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        Student2 s=new Student2();
        s.rollNo=57;
        s.name="Sunil";
        s.avg=80.5f;
        s.dept="Aiml";

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();
    }
}
