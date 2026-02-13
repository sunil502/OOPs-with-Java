package JavaIOStreams;
import java.util.*;
import java.io.FileOutputStream;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class PrintStream {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("C:/Users/Sunil/Desktop/OOPS/Student.txt");
        java.io.PrintStream ps = new java.io.PrintStream(fos);


        Student s=new Student();
        s.rollNo=57;
        s.name="Sunil";
        s.dept="Aiml";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

    }
}
