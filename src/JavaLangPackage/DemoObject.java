package JavaLangPackage;

class MyObject{
    public String toString(){
        return "My object";
    }
    public int hashCode(){
        return  100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
public class DemoObject {
    public static  void main(String[] args){
        Object o=new Object();

        System.out.println(o.toString());
        System.out.println(o.hashCode());
        System.out.println(o.getClass());

        Object o2=new MyObject();
        System.out.println(o2.equals(o));

        Object o3=new MyObject();
        System.out.println(o2.toString());
        System.out.println(o3.equals(o2));
    }
}
