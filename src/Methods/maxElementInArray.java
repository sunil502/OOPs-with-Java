package Methods;

public class maxElementInArray {
    static  int findmax(int A[]){
        int max=A[0];
        for(int i=0;i<5;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int A[]={2,6,3,8,4};
        System.out.println(findmax(A));
    }
}
