package JavaGenerics;

public class GenericDemo <T> {

    T data[]=(T[]) new Object[3];

    public static void main(String[] args) {
//        Object obj=new String("Hello");
//        obj=new Integer(10);
//        String str=(String) obj;

//        Object obj[]=new Object[3];
//        obj[0]="Hi";
//        obj[1]="Bye";
//        obj[2]=new Integer(10);

        GenericDemo<String> gd=new GenericDemo();
        gd.data[0]="hi";
        gd.data[1]="bye";

    }
}
