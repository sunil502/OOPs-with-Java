package CollectionFramework;

import java.util.Arrays;

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,8,1,3,5};
        System.out.println(Arrays.compare(a,b));

        System.out.println("copy:");
        int c[]=Arrays.copyOf(a,a.length);
        for (int x:c)
            System.out.print(x+" ");

        System.out.println("\nSort:");
        Arrays.sort(c);
        for(int x:c)
            System.out.print(x+" ");

        System.out.println("\nfill");
        Arrays.fill(c,10);
        for(int x:c)
            System.out.print(x+" ");

        System.out.println("\nbinary search:");
        System.out.println(Arrays.binarySearch(c,2));




    }
}
