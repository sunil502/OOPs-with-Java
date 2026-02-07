package JavaLangPackage;

public class WrapperClass {
    public static void main(String[] args){
        Integer i=10;
        Integer a=Integer.valueOf(10);
        Integer b=10;
        Integer ab=Integer.valueOf(10);

        Byte c=15;
        Byte d=Byte.valueOf("15");
        byte bb=15;
        Byte e=Byte.valueOf(bb);

        Short f=Short.valueOf("123");

        Float g=12.5f;

        Float h=Float.valueOf("123.5");

        Double j=Double.valueOf(123.323);

        Character k=Character.valueOf('A');

        Boolean l=Boolean.valueOf("true");

    }
}
