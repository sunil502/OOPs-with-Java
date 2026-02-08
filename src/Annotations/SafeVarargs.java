
package Annotations;

class My<T>{
    @java.lang.SafeVarargs
    private void show(T...arg){
        for(T x:arg)
            System.out.println(x);
    }
}

public class SafeVarargs {
    public static void main(String[] args){

    }
}
