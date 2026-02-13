package JavaIOStreams;

import java.io.*;

class Student3 implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Student3() {
    }
    public Student3(int r,String n,float a,String d){
        rollNo=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                ", dept='" + dept + '\'' +
                ", t=" + t +
                '}';
    }
}

public class ObjectDemoSerialization {
//    public static void main(String[] args) throws Exception {
//        FileOutputStream fos=new FileOutputStream("C:/Users/Sunil/Desktop/OOPS/Student2.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//
//        Student3 s=new Student3(10,"john",89.7f,"Cse");
//
//        oos.writeObject(s);
//
//        oos.close();
//        fos.close();
//    }

    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Student2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student3 s=(Student3)ois.readObject();

        System.out.println(s);

        ois.close();
        fis.close();
    }
}
