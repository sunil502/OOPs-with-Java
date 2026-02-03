package ExceptionHandling;

public class NestedCatch {
    public static void main (String[] args){

        int A[]={10,0,4,2,6};
        try {
            int r=A[0]/A[1];
            System.out.println(r);
            try{
                System.out.println(A[10]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("index is invalid");
            }

        }
        catch (ArithmeticException e){
            System.out.println("denominator should not be  zero");
        }

    }
}
