package JavaLangPackage;

public class FloatClass {
    public static void main(String[] args){
        float a=1.232f;
        Float b=1.232f;
        System.out.println(b.equals(a));

        Float c=2.23f/0;
        System.out.println(c.isInfinite());
        System.out.println(c==Float.POSITIVE_INFINITY);
        System.out.println(c==Float.NEGATIVE_INFINITY);

        Float d=(float)Math.sqrt(-1);
        System.out.println(b.isNaN());
    }
}
