package ExceptionHandling;

public class MultiTryCatch {
    public static void main (String[] args){

        int A[]={10,0,4,2,6};
        try {
            int r=A[0]/A[2];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch (ArithmeticException e){
            System.out.println("denominator should not be  zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index is invalid");
        }
    }
}
