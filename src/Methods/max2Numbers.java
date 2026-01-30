package Methods;

// public class max2Numbers {
//     static int max(int x,int y){
//         if(x>y)
//             return x;
//         else
//             return y;
//     }

//     public static void main(String args[]){
//         int a=10,b=23,c;
//         c=max(a,b);
//         System.out.println(c);
//     }
// }


// without static

public class max2Numbers {
    int max(int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }

    public static void main(String args[]){
        int a=10,b=23;
        max2Numbers M2=new max2Numbers ();

        System.out.println(M2.max(a,b));
    }
}