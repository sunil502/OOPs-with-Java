package JavaGenerics;

@SuppressWarnings("UnChecked")
class MyArray1<T>{
    T A[]=(T[]) new Object[10];
    int length=0;

    public void append(T v){
        A[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}

public class MyArray {
    public static void main(String[] args) {
        MyArray1<String> ma=new MyArray1<>();

        ma.append("hi");
        ma.append("bye");

        ma.display();

    }
}
