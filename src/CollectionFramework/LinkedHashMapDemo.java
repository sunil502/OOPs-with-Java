package CollectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);
        lhm.put(0,"A");
        lhm.put(1,"B");
        lhm.put(2,"C");
        lhm.put(3,"D");
        lhm.put(4,"E");
        System.out.println(lhm);

        lhm.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println(lhm.get(3));

    }
}
