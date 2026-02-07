package JavaLangPackage;

enum Dept{
    CS,IT,CIVIL,ECE
}

public class Enum {
    public static void main(String[] args ){
        Dept d=Dept.CIVIL;
        System.out.println(d.name());
        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("IT"));

        Dept list[]=Dept.values();
        for(Dept x:list)
            System.out.print(x+" ");

    }
}
