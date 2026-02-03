package ExceptionHandling;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}

class Stack1{
    private int size;
    private int top=-1;
    private int S[];
    public Stack1(int sz){
        size = sz;
        S=new int[sz];
    }
    public void push(int x) throws StackOverFlow{
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }
    public int pop()throws StackUnderFlow{
        int x=-1;
        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;
    }


}

public class StackProblem {
    public static void main(String[] args){
        Stack1 st=new Stack1(5);
        try{
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(25);
            st.push(16);
            st.push(50);
        }
        catch (StackOverFlow s){
            System.out.println(s);
        }




    }
}
