package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1=new LinkedList<>();
        LinkedList<Integer> al2=new LinkedList<>(List.of(40,50,60,70));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);

        System.out.println(al1);
        System.out.println(al1.contains(50));
        System.out.println(al1.get(4));
        System.out.println(al1.indexOf(50));
        al1.addFirst(20);
        System.out.println(al1);
        al1.addLast(25);
        System.out.println(al1);

    }

}
