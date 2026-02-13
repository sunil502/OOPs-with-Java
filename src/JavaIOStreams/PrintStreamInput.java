package JavaIOStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PrintStreamInput {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Student.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));

        Student s=new Student();
        s.rollNo=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept= br.readLine();

        System.out.println("Name "+s.name);
        System.out.println("Roll no. "+s.rollNo);
        System.out.println("Deparment "+s.dept);
    }
}
