package oop;

class students{
    public int roll;
    public String name;
    public String course;
    public  int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String details(){
        return "Name:"+name+"\n"+"Roll no:"+roll+"\n"
                +"Course:"+course+"\n"+"Average:"+average()+"\n"
                +"Grade:"+grade()+"\n";
    }

}

public class Student {
    public static void main(String[] args){
        students s=new students();
        s.roll=57;
        s.name="Sunil";
        s.course="B.tech";

        s.m1=87;
        s.m2=89;
        s.m3=93;

        System.out.println("Total is :"+s.total());
        System.out.println("average is:"+s.average());
        System.out.println("Grade is:"+s.grade());
        System.out.println("\n"+"Details is :\n" +
                ""+s.details());
    }
}
