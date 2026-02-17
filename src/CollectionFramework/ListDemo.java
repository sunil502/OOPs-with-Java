package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,50));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);

        System.out.println(al1);
        System.out.println(al1.contains(50));
        System.out.println(al1.get(4));
        System.out.println(al1.indexOf(50));
        System.out.println(al1.lastIndexOf(50));
        al1.set(3,80);
        System.out.println(al1);

        for (Integer x : al1)
            System.out.print(x + " ");

        ListIterator<Integer> it=al1.listIterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }

        al1.forEach(n-> System.out.print("  "+n));
    }
}
