package CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");

        System.out.println(ht);

        ht.compute(2,(k,v)->v+"z");
        ht.computeIfAbsent(7,(k)->"x");

        String s=(String) ht.get(3);

//        Enumeration e= ht.elements();
        Enumeration e= ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println(ht);


    }
}
