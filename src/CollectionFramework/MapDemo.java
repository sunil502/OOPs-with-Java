package CollectionFramework;

import java.security.KeyStore;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
        tm.put(3,"D");
        tm.put(4,"E");

        System.out.println(tm);
        System.out.println(tm.ceilingEntry(4).getValue());
        System.out.println(tm.get(4));

        Map.Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());

    }
}
