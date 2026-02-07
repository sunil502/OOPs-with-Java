package JavaLangPackage;

public class IntegerClass {
    public static void  main(String[] args){
        int m1=15;
        Integer m2 =m1;
        Integer m3=15;

        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));

        Integer m4= Integer.valueOf("123");
        Integer m5= Integer.valueOf("1110",2);
        Integer m6=Integer.decode("0xA7");

        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(Integer.toBinaryString(53));
    }
}
