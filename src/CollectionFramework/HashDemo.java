package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C"));
        tm.put(3,"D");
        tm.put(4,"E");

        System.out.println(tm);
        System.out.println(tm.get(4));

    }
}
