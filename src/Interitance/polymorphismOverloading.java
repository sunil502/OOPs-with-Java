package Interitance;

class Test{
    public int max(int x,int y){
        return x>y?x:y;
    }

    public int max(int x,int y,int z){
        if(x>y && x>z)
            return x;
        else if (y>z)
            return y;
        else
            return z;

    }
}

public class polymorphismOverloading {
    public static void main(String[] args){
        Test t=new Test();
        System.out.println("maximum of 2 numbers is:"+t.max(4,6));
        System.out.println("maximum of 3 numbers is:"+t.max(7,2,9));

    }
}
