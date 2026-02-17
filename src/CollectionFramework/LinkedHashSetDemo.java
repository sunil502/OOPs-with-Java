package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String>lhs=new LinkedHashSet<>(10);
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        System.out.println(lhs);
        lhs.forEach(System.out::println);

        Iterator<String> itr= lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
