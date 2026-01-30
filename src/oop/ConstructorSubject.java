package oop;

class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subId,String name){
        this.subId=subId;
        this.name=name;

    }
    public Subject(String subId,String name,int maxMarks){
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubId(){
        return subId;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtained(){
        return marksObtained;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }
    public void setMarksObtained(int mo){
        marksObtained=mo;
    }
    boolean isQualified(){
        return marksObtained>=maxMarks/10*4;
    }
    public String toString(){
        return "\nSubject ID:"+subId+"\nName:"+name+"\nMarks Obtained:"+marksObtained;
    }
}

public class ConstructorSubject {
    public static void main(String[] args){
        Subject subs[]=new Subject[3];

        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","CyberSecurity",100);

        for(Subject s:subs)
            System.out.println(s);

    }
}
